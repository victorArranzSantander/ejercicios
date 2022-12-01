/* Patron Observer */

package com.mycompany.youtube;


public class Youtube {

    public static void main(String[] args) {
        CanalYT canal = new CanalYT();
        Observer user1 = new Suscriptor("Víctor", canal);
        Observer user2 = new Suscriptor("Pablo", canal);
        canal.addObserver(user1);
        canal.addObserver(user2);
        canal.nuevoVideo("video1");
    }
}
