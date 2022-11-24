package com.mycompany.juego;

public class App {

    public static void main(String[] args) {
        Juego partida1 = new Juego(10);
        System.out.println("Número de vidas: " + partida1.getVidas());
        boolean vidas = partida1.getVidas() > 0 ? true : false;
        if (vidas) {
            vidas = partida1.restarVida();
            System.out.println("Número de vidas: "+ partida1.getVidas());
        }
    }
}
