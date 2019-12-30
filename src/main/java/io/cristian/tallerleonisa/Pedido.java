package io.cristian.tallerleonisa;

import java.util.ArrayList;

public class Pedido {
    private double totalLeonisa;
    private double totalLeo;
    private double totalTeen;
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

    public void totalCategoria(){
        for (Producto producto:productos) {

            if (producto instanceof Leonisa){
                totalLeonisa+=producto.getPrecio();
            }
            if(producto instanceof Leo){
                totalLeo+=producto.getPrecio();
            }
            if (producto instanceof Teen){
                totalTeen+=producto.getPrecio();
            }
        }
    }

    public double getTotalLeonisa() {
        return totalLeonisa;
    }

    public double getTotalLeo() {
        return totalLeo;
    }

    public double getTotalTeen() {
        return totalTeen;
    }
}
