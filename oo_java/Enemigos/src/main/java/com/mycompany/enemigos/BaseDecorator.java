
package com.mycompany.enemigos;


public class BaseDecorator implements Enemigo{
    
    private Enemigo wrapper;
    
    public BaseDecorator(Enemigo enemigo){
        this.wrapper = enemigo;
    }

    public Enemigo getWrapper() {
        return wrapper;
    }

    public void setWrapper(Enemigo wrapper) {
        this.wrapper = wrapper;
    }
    
    public void setVida(int vida) {
        wrapper.setVida(vida);
    }

    public void setPotencia(int potencia) {
        wrapper.setPotencia(potencia);
    }
    
    public int getVida(){
        return wrapper.getVida();
    }
    
    public int getPotencia(){
        return wrapper.getPotencia();
    }
    
    public void atacar(){
        wrapper.atacar();
    }
    
    public void defenderse(){
        wrapper.defenderse();
    }
    
}
