
package com.mycompany.youtube;

public class Suscriptor implements Observer{
 
   private Observable canal;
   private String nombre;
    
   public Suscriptor(String nombre, Observable canal){
       this.nombre = nombre;
       this.canal = canal;
   }
   
   private String getNombre(){
       return this.nombre;
   }
   
   public void update(){
       System.out.println("Suscriptor " + getNombre() + ", último vídeo: " + canal.getVideo());
   }
    
}
