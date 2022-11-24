package main.java.com.mycompany.impuesto;

public class Tax {

    public static double calculateTax(Producto producto) {
        return producto.getPrecio() * producto.getTax();
    }

}

