package main.java.com.mycompany.impuesto;

public class Producto {

    private String nombre;
    private double precio;
    private double tax;

    public Producto(String nombre, double precio, double tax) {
        this.nombre = nombre;
        this.precio = precio;
        this.tax = tax;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }


    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
