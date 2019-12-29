package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeoTest{

    private Categoria categoria;
    private Leo leo;
    @Before
    public void setUp() throws Exception {
        leo = new Leo("123k",3000.45);
        categoria = new Categoria("bozer","L","blanco","algodón");
        leo.setCategoria(categoria);
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
}