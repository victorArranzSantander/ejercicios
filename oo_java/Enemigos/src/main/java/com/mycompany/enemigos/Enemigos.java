/* Patron decorador */

package com.mycompany.enemigos;


public class Enemigos {

    public static void main(String[] args) {
        Enemigo enemigo1 = new EnemigoBase();
        Enemigo enemigo2 = new EnemigoBase();
        Enemigo enemigo3 = new EnemigoBase();
        
        System.out.println("Enemigo base defendiéndose.");
        enemigo1.defenderse();
        
        System.out.println("Enemigo con armadura defendiéndose.");
        enemigo1 = new DecoratorArmadura(enemigo1);
        enemigo1.defenderse();
        
        System.out.println("Enemigo base atacando.");
        enemigo2.atacar();
        
        System.out.println("Enemigo con espada atacando.");
        enemigo2 = new DecoratorEspada(enemigo2);
        enemigo2.atacar();
        
        System.out.println("Enemigo con espada y armadura defendiéndose y atacando.");
        enemigo3 = new DecoratorArmadura(enemigo3);
        enemigo3 = new DecoratorEspada(enemigo3);
        enemigo3.atacar();
        enemigo3.defenderse();
        
    }
}
