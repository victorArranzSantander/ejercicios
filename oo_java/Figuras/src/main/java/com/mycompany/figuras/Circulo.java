package main.java.com.mycompany.figuras;

public class Circulo extends Forma {
    
    private double radio;
    
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }


    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * getRadio();
    }
    
    public double getArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    @Override
    public String toString() {
        String relleno = getRelleno() ? " relleno" : "";
        String string = "Círculo de color " + getColor() + relleno + " de radio " + getRadio() + ".\n"
                + "Perímetro: " + getPerimetro() + "\n"
                + "Área: " + getArea() + "\n";
        return string;
    }
}
