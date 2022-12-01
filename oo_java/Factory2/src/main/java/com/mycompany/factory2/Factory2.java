/* Patron factoria abstract */
package com.mycompany.factory2;

import java.util.Scanner;


public class Factory2 {
    
    public static void main(String[] args){
        Aplicacion app = elegirTema();
        app.pintar();
    }
    
    public static Aplicacion elegirTema(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el tipo de tema deseado (0 = claro / 1 = oscuro).");
        int entrada = reader.nextInt();
        Aplicacion app;
        if (entrada == 0){
            app = new Aplicacion(new FactoryClaro());
        }
        else{
            app = new Aplicacion(new FactoryOscuro());
        }
        return app;
    }

    
}
