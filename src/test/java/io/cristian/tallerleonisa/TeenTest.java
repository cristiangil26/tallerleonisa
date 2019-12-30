package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeenTest  {

    private Categoria categoria;
    private Teen teen;
    private Pedido pedido;
    @Before
    public void setUp() throws Exception {
        teen = new Teen("123k",3000.45);
        categoria = new Categoria("tanga","m","rosada","seda");
        teen.setCategoria(categoria);
        pedido = new Pedido();
        pedido.asignarProducto(teen);
        pedido.totalCategoria();
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("el resultado no es igual","123k",teen.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertTrue("los valores no son iguales",teen.getPrecio() == 3000.45);
    }

    @Test
    public void setPrecio() {
        Assert.assertTrue(teen.getPrecio() >=0);
    }

    @Test
    public void getCategoria() {
        Assert.assertEquals(categoria,teen.getCategoria());
    }

    @Test
    public void setCategoria() {
        Assert.assertNotNull("el objeto no puede ser nulo",categoria);
    }

    @Test
    public void descuentoPagoEfectivo() {
        Assert.assertTrue("los valores no son iguales",
                teen.descuentoPagoEfectivo(pedido.getTotalTeen()) == 1200.18);

    }
}