package main.java.com.mycompany.figuras;

public class Rectangulo extends Forma {
    
    private double lado1;
    private double lado2;
    
    public Rectangulo(String color, boolean relleno, double lado1, double lado2) {
        super(color, relleno);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getPerimetro() {
        return 2 * getLado1() + 2 * getLado2();
    }
    
    public double getArea() {
        return getLado1() * getLado2();
    }

    @Override
    public String toString() {
        String relleno = getRelleno() ? " relleno" : "";
        double lmenor = getLado1() >= getLado2() ? getLado2() : getLado1();
        String string = "Rectángulo de color " + getColor() + relleno + " de lado menor " + lmenor + ".\n"
                + "Perímetro: " + getPerimetro() + "\n"
                + "Área: " + getArea() + "\n";
        return string;
    }


}
