package io.cristian.tallerleonisa;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Producto> productos = new ArrayList<Producto>();
    public void asignarProducto(Leonisa leonisa){
        productos.add(leonisa);
    }
    public void asignarProducto(Leo leo){
        productos.add(leo);
    }
    public void asignarProducto(Teen teen){
        productos.add(teen);
    }
}
