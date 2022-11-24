
package com.mycompany.impuesto;

import main.java.com.mycompany.impuesto.Producto;
import main.java.com.mycompany.impuesto.Tax;

public class Impuesto {

    public static void main(String[] args) {
        Producto p1 = new Producto("Pelota", 10, 0.21);
        System.out.println(Tax.calculateTax(p1));
    }
}
