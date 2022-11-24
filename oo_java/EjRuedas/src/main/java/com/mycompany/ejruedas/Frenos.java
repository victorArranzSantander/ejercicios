package com.mycompany.ejruedas;

public class Frenos {

    private int tam;

    public Frenos(int tam) {
        this.tam = tam;
    }


    public int getTam() {
        return this.tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }


    
    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}
