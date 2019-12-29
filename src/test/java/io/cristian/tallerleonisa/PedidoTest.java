package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;
    @Before
    public void setUp() throws Exception {
        leonisa = new Leonisa("123k",3000.45);
        leo = new Leo("123kh",3030.45);
        teen = new Teen("123kh",3030.45);
    }

    @Test
    public void asignarProducto() {
        Assert.assertNotNull("el objeto no puede ser nulo",leonisa);
    }

    @Test
    public void testAsignarProducto() {
        Assert.assertNotNull("el objeto no puede ser nulo",leo);
    }

    @Test
    public void testAsignarProducto1() {
        Assert.assertNotNull("el objeto no puede ser nulo",teen);
    }
}