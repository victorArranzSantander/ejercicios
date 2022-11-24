
package com.mycompany.pokemon;


public class AtaqueFisico implements Strategy{
    
    @Override
    public void atacar(){
        System.out.println("Ataque de tipo físico.");
    }
    
}
