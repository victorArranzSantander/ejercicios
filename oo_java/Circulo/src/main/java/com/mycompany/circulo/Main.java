package com.mycompany.circulo;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1, "red");
        System.out.println("Introduce el radio del círculo: ");
        Scanner reader = new Scanner(System.in);
        double radio = Double.parseDouble(reader.nextLine());
        circulo.setRadio(radio);
        System.out.println("Introduce el color del círculo: ");
        String color = reader.nextLine();
        circulo.setColor(color);
        String report = circulo.getReport();
        System.out.println(report);
        reader.close();
    }
}