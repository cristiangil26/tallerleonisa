package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;
    private Pedido pedido;
    @Before
    public void setUp() throws Exception {
        leonisa = new Leonisa("123k",3000.45);
        leo = new Leo("123kh",3030.45);
        teen = new Teen("123kh",3030.45);
        pedido = new Pedido();
        pedido.asignarProducto(leonisa);
        pedido.asignarProducto(leo);
        pedido.asignarProducto(teen);
        pedido.totalCategoria();

    }

    @Test
    public void asignarProducto() {
        Assert.assertTrue("el objeto no puede ser nulo",pedido.asignarProducto(leonisa));
    }

    @Test
    public void testAsignarProducto() {
        Assert.assertTrue("el objeto no puede ser nulo",pedido.asignarProducto(leo));
    }

    @Test
    public void testAsignarProducto1() {
        Assert.assertTrue("el objeto no puede ser nulo",pedido.asignarProducto(teen));
    }

    @Test
    public void getTotalLeonisa() {
        Assert.assertTrue("total de la categoría leonisa no es igual",3000.45 == pedido.getTotalLeonisa());
    }

    @Test
    public void getTotalLeo() {
        Assert.assertTrue("total de la categoría leo no es igual",3030.45 == pedido.getTotalLeo());
    }

    @Test
    public void getTotalTeen() {
        Assert.assertTrue("total de la categoría teen no es igual",3030.45 == pedido.getTotalTeen());
    }
}