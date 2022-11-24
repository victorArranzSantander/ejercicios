package main.java.com.mycompany.ajedrez;

public class Torre extends Pieza {
    
    private int x;
    private int y;
    private String color;

    public Torre(int x, int y, String color) {
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

    private boolean compruebaTorre(int x, int y, int pasos) {
        boolean torre = true;
        if (x != getX() && y != getY()) {
            torre = false;
        }
        if (pasos < 0 || pasos > 8) {
            torre = false;
        }
        return torre;
    }


    public void moverPieza(int x, int y) {
        int pasos = 0;
        if (x != getX()) {
            pasos = x - getX();
        }
        if (y != getY()) {
            pasos = y - getY();
        }
        if (compruebaTorre(x, y, Math.abs(pasos))) {
            String movimiento = "Moviendo torre de (" + getX() + ", " + getY() + ")";
            if (x != getX()) {
                moverHorizontal(pasos);
            }
            if (y != getY()) {
                moverVertical(pasos);
            }
            movimiento += " a (" + getX() + ", " + getY() + ")";
            System.out.println(movimiento);
        }
        else {
            System.out.println("Movimiento ilegal");
        }

    }

}