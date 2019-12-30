package io.cristian.tallerleonisa;

public class Leonisa extends Producto implements ProntoPagable {
    public Leonisa(String ciu, double precio) {
        super(ciu, precio);
    }

    public double descuentoProntoPago(int numDias, double valorCompra) {
        double descuento = 0;
        if (numDias >20){
            descuento = (valorCompra * 0.10);
        }
        else if(numDias > 2 && numDias <= 10){
            descuento = (valorCompra * 0.20);
        }
        else if(numDias > 0 && numDias < 2 ){
            descuento = (valorCompra * 0.30);
        }

        return descuento;
    }
}
