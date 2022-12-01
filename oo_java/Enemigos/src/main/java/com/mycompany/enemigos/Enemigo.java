
package com.mycompany.enemigos;


public interface Enemigo {
    
    public void atacar();
    public void defenderse();
    public void setPotencia(int potencia);
    public void setVida(int vida);
    public int getPotencia();
    public int getVida();
    
}
