package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest{
    private Categoria categoria;
    @Before
    public void setUp() throws Exception {

        categoria = new Categoria();
        categoria.setTipoPrenda("tanga");
        categoria.setTalla("M");
        categoria.setColor("rosada");
        categoria.setMaterial("seda");
    }

    @Test
    public void testGetTipoPrenda() {
        Assert.assertEquals("no es el mismo tipo de prenda","tanga",categoria.getTipoPrenda());
    }

    @Test
    public void testSetTipoPrenda() {
        Assert.assertTrue("el tipo de prenda no puede ser vacìa",categoria.getTipoPrenda() != "");
    }

    @Test
    public void testGetTalla() {
        Assert.assertEquals("la talla no es igual","M",categoria.getTalla());
    }

    @Test
    public void testSetTalla() {
        Assert.assertTrue("la talla no puede ser vacìa",categoria.getTalla() != "");
    }

    @Test
    public void testGetColor() {
        Assert.assertEquals("el color no es el mismo","rosada",categoria.getColor());
    }

    @Test
    public void testSetColor() {
        Assert.assertTrue("el color no puede ser vacìo",categoria.getColor() != "");
    }

    @Test
    public void testGetMaterial() {
        Assert.assertEquals("el material no es igual","seda",categoria.getMaterial());
    }

    @Test
    public void testSetMaterial() {
        Assert.assertTrue("el valor del material no puede ser vacio", categoria.getMaterial() != "");
    }
}