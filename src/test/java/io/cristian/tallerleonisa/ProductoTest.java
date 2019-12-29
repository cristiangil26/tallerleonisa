package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductoTest {
     private Categoria categoria;
     private Producto producto;
    @Before
    public void setUp() throws Exception {
        categoria = new Categoria("Brazier","34b","negro","algodón");
        producto = new Producto("adf23",23243);
        producto.setCategoria(categoria);
    }
    @Test
    public void setCategoria(){
        Assert.assertNotNull("el objeto no puede ser nulo",categoria);
    }
    @Test
    public void getCategoria() {
        Assert.assertEquals(categoria,producto.getCategoria());
    }

    @Test
    public void getCiu(){
        Assert.assertEquals("el resultado no es igual","adf23",producto.getCiu());
    }
    @Test
    public void getPrecio(){
        Assert.assertTrue("los valores no son iguales",producto.getPrecio() == 23243);
    }
    @Test
    public void setPrecio(){
        Assert.assertTrue(producto.getPrecio() >=0);
    }
}