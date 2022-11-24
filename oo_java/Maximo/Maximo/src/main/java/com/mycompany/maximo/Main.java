package com.mycompany.maximo;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        System.out.println("Int");
        Maximo maximo1 = new Maximo(num1, num2);
        System.out.println(maximo1.maximo());

        long num11 = 10;
        long num21 = 11;
        System.out.println("Long");
        Maximo maximo2 = new Maximo(num11, num21);
        System.out.println(maximo2.maximo());

        float num12 = 10;
        float num22 = 11;
        System.out.println("Float");
        Maximo maximo3 = new Maximo(num12, num22);
        System.out.println(maximo3.maximo());

        double num13 = 10;
        double num23 = 11;
        System.out.println("Double");
        Maximo maximo4 = new Maximo(num13, num23);
        System.out.println(maximo4.maximo());
    }
}