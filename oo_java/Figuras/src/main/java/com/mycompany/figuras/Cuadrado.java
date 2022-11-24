package main.java.com.mycompany.figuras;

public class Cuadrado extends Rectangulo {

    
    public Cuadrado(String color, boolean relleno, double lado) {
        super(color, relleno, lado, lado);
    }

    @Override
    public String toString() {
        String relleno = getRelleno() ? " relleno" : "";
        String string = "Cuadrado de color " + getColor() + relleno + " de lado " + getLado1() + ".\n"
                + "Perímetro: " + getPerimetro() + "\n"
                + "Área: " + getArea() + "\n";
        return string;
    }
    
}