/* Patron singleton */

package com.mycompany.singleton;

public class Singleton {

    public static void main(String[] args) {
        Inventario inventario = Inventario.getInstance();
        inventario.setTornillos(100);
        inventario.setTuercas(200);
        inventario.setArandelas(300);
        inventario.getInfo();
        
        Inventario inventario2 = Inventario.getInstance();
        inventario2.getInfo();
        
    }
}
