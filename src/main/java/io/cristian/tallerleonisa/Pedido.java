package io.cristian.tallerleonisa;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos = new ArrayList<Producto>();


    public boolean asignarProducto(Leonisa leonisa){
        if (leonisa != null){
            productos.add(leonisa);
            return true;
        }
        return false;
    }
    public boolean asignarProducto(Leo leo){
        if (leo != null){
            productos.add(leo);
            return true;
        }
        return false;
    }
    public boolean asignarProducto(Teen teen){
        if (teen != null){
            productos.add(teen);
            return true;
        }
        return false;
    }

    public ArrayList<Producto> getProductos() throws PedidoException{
        return productos;
    }
}
