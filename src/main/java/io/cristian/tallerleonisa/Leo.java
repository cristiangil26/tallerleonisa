package io.cristian.tallerleonisa;

public class Leo extends Producto implements ProntoPagable,Cashable{
    public Leo(String ciu, double precio) {
        super(ciu, precio);
    }

    public double descuentoPagoEfectivo(int cantidadProductos) {
        return 0;
    }

    public double descuentoProntoPago(int numDias) {
        return 0;
    }
}
