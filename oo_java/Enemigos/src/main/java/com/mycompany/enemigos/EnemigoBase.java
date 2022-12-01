
package com.mycompany.enemigos;


public class EnemigoBase implements Enemigo{
    
    private int vida = 100;
    private int potencia = 60;

    public int getVida() {
        return vida;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void atacar(){
        System.out.println("El enemigo ha infligido " + getPotencia() + " puntos de daño.");
    }
    
    public void defenderse(){
        System.out.println("El enemigo se ha defendido! Tiene " + getVida() + " puntos de vida.");
    }
}
