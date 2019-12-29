package io.cristian.tallerleonisa;

public class Categoria {
    private String tipoPrenda;
    private String talla;
    private String color;
    private String material;

    public Categoria(String tipoPrenda, String talla, String color, String material) {
        this.tipoPrenda = tipoPrenda;
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
