
package com.mycompany.enemigos;


public class DecoratorArmadura extends BaseDecorator{
    
    private Enemigo enemigo;
    
    public DecoratorArmadura(Enemigo enemigo){
        super(enemigo);
        this.enemigo = enemigo;
        enemigo.setVida(enemigo.getVida() + 20);
    }
    
    @Override
    public void defenderse(){
        System.out.println("El enemigo se ha defendido y tiene " + enemigo.getVida() + " puntos de puntos de vida.");
    }
    
    
}
