

package com.mycompany.pokemon;

import java.util.Scanner;


public class Pokemon {

    public static void main(String[] args) {
        AtaqueFisico at1 = new AtaqueFisico();
        AtaqueEspecial at2 = new AtaqueEspecial();
        AtaqueEstados at3 = new AtaqueEstados();
        Context context = new Context();
        context.anadirAtaque(at1);
        context.anadirAtaque(at2);
        context.anadirAtaque(at3);
        context.eliminarAtaque(at1);
        System.out.println("Introduce un tipo de ataque Pokémon.");
        Scanner reader = new Scanner(System.in);
        int entrada = reader.nextInt();
        context.getAtaque(entrada).atacar();
    }
}
