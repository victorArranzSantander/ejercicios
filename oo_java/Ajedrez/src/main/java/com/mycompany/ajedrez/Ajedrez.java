
package com.mycompany.ajedrez;

import main.java.com.mycompany.ajedrez.Alfil;
import main.java.com.mycompany.ajedrez.Peon;
import main.java.com.mycompany.ajedrez.Torre;

public class Ajedrez {

    public static void main(String[] args) {
        Peon p1 = new Peon(0, 1, "black");
        p1.moverPieza(0, 3);
        Torre t1 = new Torre(5, 0, "black");
        t1.moverPieza(0, 0);
        Alfil a1 = new Alfil(2, 0, "black");
        a1.moverPieza(4, 2);
    }
}
