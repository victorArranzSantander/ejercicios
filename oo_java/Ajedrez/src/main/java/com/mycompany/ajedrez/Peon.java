package main.java.com.mycompany.ajedrez;

public class Peon extends Pieza {
    
    private int x;
    private int y;
    private String color;

    public Peon(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void moverVertical(int pasos) {
        setY(getY() + pasos);
    }

    private boolean compruebaPeon(int pasos) {
        return pasos > 0 && pasos <= 2;
    }

    public void moverPieza(int x, int y) {
        int pasos = y - getY();
        if (compruebaPeon(pasos)) {
            String movimiento = "Moviendo peón de (" + getX() + ", " + getY() + ")";
            moverVertical(pasos);
            movimiento += " a (" + getX() + ", " + getY() + ")";
            System.out.println(movimiento);
        }
        else {
            System.out.println("Movimiento ilegal");
        }

    }

}
