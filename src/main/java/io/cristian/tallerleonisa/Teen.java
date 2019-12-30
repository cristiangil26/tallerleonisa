package io.cristian.tallerleonisa;

public class Teen extends Producto implements Cashable{
    public Teen(String ciu, double precio) {
        super(ciu, precio);
    }
    public double descuentoPagoEfectivo(double valorCompra) {
        return valorCompra*0.40;
    }
}
