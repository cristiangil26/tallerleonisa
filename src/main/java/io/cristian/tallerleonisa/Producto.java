package io.cristian.tallerleonisa;

public class Producto {
    private String ciu;
    private double precio;
    private Categoria categoria;
    public Producto(String ciu, double precio) {
        this.ciu = ciu;
        this.precio = precio;
    }

    public String getCiu() {
        return ciu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
