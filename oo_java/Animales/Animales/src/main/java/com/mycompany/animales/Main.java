package com.mycompany.animales;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animales animales = new Animales(4, "Tigre");
        System.out.println("Nuevo animal: ");
        System.out.println("Introduce el número de patas del animal: ");
        Scanner reader = new Scanner(System.in);
        int patas = Integer.parseInt(reader.nextLine());
        animales.setPatas(patas);
        System.out.println("Introduce el nombre de la especie: ");
        String especie = reader.nextLine();
        animales.setEspecie(especie);
        reader.close();
        System.out.println("Número total de animales en el zoo: " + Animales.getAnimales());
    }
}