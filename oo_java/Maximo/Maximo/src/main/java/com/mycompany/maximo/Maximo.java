package com.mycompany.maximo;

public class Maximo {

    private int num1_int;
    private int num2_int;
    private long num1_long;
    private long num2_long;
    private float num1_float;
    private float num2_float;
    private double num1_double;
    private double num2_double;
    private String tipo;

    public Maximo(int num1, int num2) {
        this.num1_int = num1;
        this.num2_int = num2;
        this.tipo = "int";
    }

    public Maximo(long num1, long num2) {
        this.num1_long = num1;
        this.num2_long = num2;
        this.tipo = "long";
    }

    public Maximo(float num1, float num2) {
        this.num1_float = num1;
        this.num2_float = num2;
        this.tipo = "float";
    }

    public Maximo(double num1, double num2){
        this.num1_double = num1;
        this.num2_double = num2;
        this.tipo = "double";
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public int getNum1_int() {
        return this.num1_int;
    }

    public void setNum1_int(int num1_int) {
        this.num1_int = num1_int;
    }

    public int getNum2_int() {
        return this.num2_int;
    }

    public void setNum2_int(int num2_int) {
        this.num2_int = num2_int;
    }

    public long getNum1_long() {
        return this.num1_long;
    }

    public void setNum1_long(long num1_long) {
        this.num1_long = num1_long;
    }

    public long getNum2_long() {
        return this.num2_long;
    }

    public void setNum2_long(long num2_long) {
        this.num2_long = num2_long;
    }

    public float getNum1_float() {
        return this.num1_float;
    }

    public void setNum1_float(float num1_float) {
        this.num1_float = num1_float;
    }

    public float getNum2_float() {
        return this.num2_float;
    }

    public void setNum2_float(float num2_float) {
        this.num2_float = num2_float;
    }

    public double getNum1_double() {
        return this.num1_double;
    }

    public void setNum1_double(double num1_double) {
        this.num1_double = num1_double;
    }

    public double getNum2_double() {
        return this.num2_double;
    }

    public void setNum2_double(double num2_double) {
        this.num2_double = num2_double;
    }

    public double calculaMaximo(double num1, double num2) {
        return num1 == num2 ? 0 : Math.max(num1, num2);
    }



    public String maximo() {
        String maximo = "";
        switch (getTipo()) {
            case "int":
                maximo = String.valueOf(calculaMaximo((double) getNum1_int(), (double) getNum2_int()));
                break;
            case "long":
                maximo = String.valueOf(calculaMaximo((double) getNum1_long(), (double) getNum2_long()));
                break;
            case "float":
                maximo = String.valueOf(calculaMaximo((double) getNum1_float(), (double) getNum2_float()));
                break;
            case "double":
                maximo = String.valueOf(calculaMaximo((double) getNum1_double(), (double) getNum2_double()));
                break;
        }
        return maximo.equals("0.0") ? "Números iguales" : "Número mayor: "+maximo.toString();
    }
    



}
