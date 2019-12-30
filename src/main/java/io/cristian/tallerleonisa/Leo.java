package io.cristian.tallerleonisa;

public class Leo extends Producto implements ProntoPagable,Cashable{
    public Leo(String ciu, double precio) {
        super(ciu, precio);
    }

    public double descuentoPagoEfectivo(double valorCompra) {

        return valorCompra*0.40;
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
