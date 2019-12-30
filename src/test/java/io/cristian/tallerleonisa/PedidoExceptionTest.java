package io.cristian.tallerleonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoExceptionTest extends Categoria {
    private PedidoException exception;

    @Before
    public void setUp() throws Exception {
        exception = new PedidoException();
    }
    @Test
    public void getMessage() {
        Assert.assertEquals("los valores no son iguales","el pedido debe ser mayor a 0",exception.getMessage());
    }
}