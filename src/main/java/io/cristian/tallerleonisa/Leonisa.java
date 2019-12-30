package io.cristian.tallerleonisa;

public class Leonisa extends Producto implements ProntoPagable {
    public Leonisa(String ciu, double precio) {
        super(ciu, precio);
    }

    public double descuentoProntoPago(int numDias) {
        return 0;
    }
}
