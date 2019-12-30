package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeoTest {

    private Categoria categoria;
    private Leo leo;
    private Pedido pedido;
    @Before
    public void setUp() throws Exception {
        leo = new Leo("123k",3000.45);
        categoria = new Categoria("bozer","L","blanco","algodón");
        leo.setCategoria(categoria);
        pedido = new Pedido();
        pedido.asignarProducto(leo);
        pedido.totalCategoria();
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("el resultado no es igual","123k",leo.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertTrue("los valores no son iguales",leo.getPrecio() == 3000.45);
    }

    @Test
    public void setPrecio() {
        Assert.assertTrue(leo.getPrecio() >=0);
    }

    @Test
    public void getCategoria() {
        Assert.assertEquals(categoria,leo.getCategoria());
    }

    @Test
    public void setCategoria() {
        Assert.assertNotNull("el objeto no puede ser nulo",categoria);
    }

    @Test
    public void descuentoPagoEfectivo() {

        Assert.assertTrue("los valores no son iguales",
               leo.descuentoPagoEfectivo(pedido.getTotalLeo()) == 1200.18);
    }

    @Test
    public void descuentoProntoPago() {
        Assert.assertTrue("los valores no son iguales",
                leo.descuentoProntoPago(24, pedido.getTotalLeo()) == 300.045);
    }
}