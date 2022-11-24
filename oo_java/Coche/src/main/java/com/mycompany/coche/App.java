
package com.mycompany.coche;

import main.java.com.mycompany.coche.CocheCombustion;
import main.java.com.mycompany.coche.Motor;

public class App {

    public static void main(String[] args) {
        CocheCombustion c1;
        CocheElectrico c2;
        c1.encenderMotor();
        c1.acelerar();
        c2.encenderMotor();
        c2.acelerar();
    }
}
