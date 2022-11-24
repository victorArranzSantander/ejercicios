package main.java.com.mycompany.figuras;

public class Forma {

    private String color;
    private boolean relleno;

    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getRelleno() {
        return this.relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }


}
