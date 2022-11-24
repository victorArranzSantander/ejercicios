package main.java.com.mycompany.coche;

public class Motor{
    
    private int revoluciones;

    public Motor(int revoluciones) {
        this.revoluciones = revoluciones;
    }


    public int getRevoluciones() {
        return this.revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public void arrancar() {
        System.out.println("Se ha arrancado el motor");
    }

    public void revolucionar() {
        System.out.println("Revoluciones: " + getRevoluciones());
    }

}
