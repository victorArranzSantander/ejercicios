
package com.mycompany.enemigos;


public class DecoratorEspada extends BaseDecorator{
    
    private Enemigo enemigo;
    
    public DecoratorEspada(Enemigo enemigo){
        super(enemigo);
        this.enemigo = enemigo;
        enemigo.setPotencia(enemigo.getPotencia() + 20);
    }
    
    @Override
    public void atacar(){
        System.out.println("El enemigo ha infligido " + enemigo.getPotencia() + " puntos de daño.");
    }
    
}
