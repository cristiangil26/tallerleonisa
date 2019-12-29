package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeonisaTest {
    private Categoria categoria;
    private Leonisa leonisa;
    @Before
    public void setUp() throws Exception {
        leonisa = new Leonisa("123k",3000.45);
        categoria = new Categoria("Brazier","34b","negro","algodón");
        leonisa.setCategoria(categoria);
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("el resultado no es igual","123k",leonisa.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertTrue("los valores no son iguales",leonisa.getPrecio() == 3000.45);
    }

    @Test
    public void setPrecio() {
        Assert.assertTrue(leonisa.getPrecio() >=0);
    }

    @Test
    public void getCategoria() {
        Assert.assertEquals(categoria,leonisa.getCategoria());
    }

    @Test
    public void setCategoria() {
        Assert.assertNotNull("el objeto no puede ser nulo",categoria);
    }
}