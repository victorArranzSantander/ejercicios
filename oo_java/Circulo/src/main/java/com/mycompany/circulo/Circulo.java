package com.mycompany.circulo;

public class Circulo {

    private double radio;
    private String color;

    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    private double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    private String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    private double getArea(){
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public String getReport(){
        return ("CÍRCULO\nRadio: " + getRadio() + "\nÁrea: " + getArea() + "\nColor: " + getColor());
    }

}


