package com.mycompany.animales;

import java.awt.Color;


public class Animales {

    private static int number = 0;
    private int patas;
    private String especie;
    private Color color;



    public Animales(int patas, String especie) {
        this.patas = patas;
        this.especie = especie;
        number++;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getAnimales() {
        return number;
    }



}


