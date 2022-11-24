package com.mycompany.figuras;

import main.java.com.mycompany.figuras.Circulo;
import main.java.com.mycompany.figuras.Cuadrado;
import main.java.com.mycompany.figuras.Rectangulo;

public class Figuras {

    public static void main(String[] args) {
        Circulo c1 = new Circulo("Azul", true, 3);
        System.out.println(c1.toString());
        Rectangulo r1 = new Rectangulo("Rojo", false, 3, 5);
        System.out.println(r1.toString());
        Cuadrado cu1 = new Cuadrado("Verde", true, 5);
        System.out.println(cu1.toString());
    }
}
