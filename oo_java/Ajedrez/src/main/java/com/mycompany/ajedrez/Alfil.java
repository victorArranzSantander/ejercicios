package main.java.com.mycompany.ajedrez;

public class Alfil extends Pieza {
    
    private int x;
    private int y;
    private String color;

    public Alfil(int x, int y, String color) {
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

    private void moverHorizontal(int pasos) {
        setX(getX() + pasos);
    }

    private boolean compruebaAlfil(int x, int y, int pasosX, int pasosY) {
        boolean alfil = true;
        if (pasosX != pasosY) {
            alfil = false;
        }
        if (pasosX < 0 || pasosX > 8) {
            alfil = false;
        }
        return alfil;
    }


    public void moverPieza(int x, int y) {
        int pasosX = 0;
        int pasosY = 0;
        if (x != getX()) {
            pasosX = x - getX();
        }
        if (y != getY()) {
            pasosY = y - getY();
        }
        if (compruebaAlfil(x, y, Math.abs(pasosX), Math.abs(pasosY))) {
            String movimiento = "Moviendo alfil de (" + getX() + ", " + getY() + ")";
            moverHorizontal(pasosX);
            moverVertical(pasosY);
            movimiento += " a (" + getX() + ", " + getY() + ")";
            System.out.println(movimiento);
        }
        else {
            System.out.println("Movimiento ilegal");
        }

    }

}