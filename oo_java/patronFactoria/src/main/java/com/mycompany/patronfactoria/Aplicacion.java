/* Patron factoria */
package com.mycompany.patronfactoria;

import java.util.Scanner;

class Aplicacion {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce tu nombre y tu apellido.");
        String entrada = reader.nextLine();
        FactoryPersona factory = new FactoryPersona();
        Persona p1 = factory.getInstance(entrada);
        p1.info();
    }
}
