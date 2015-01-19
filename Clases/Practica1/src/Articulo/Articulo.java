package Articulo;

public class Articulo {

    private int codigo;
    private int cantidad;
    private String marca;
    private double precio;
    private String descripcion;

    public Articulo(int codigo, int cantidad, String marca, double precio, String descripcion) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
