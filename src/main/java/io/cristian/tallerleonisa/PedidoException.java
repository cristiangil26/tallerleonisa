package io.cristian.tallerleonisa;

public class PedidoException extends Exception {

    public PedidoException() {
        super("el pedido debe ser mayor a 0");
    }
}
