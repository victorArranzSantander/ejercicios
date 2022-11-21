package main.java.com.mycompany.pais;

import com.mycompany.pais.Pais;
import com.mycompany.pais.Ciudad;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad("Palencia", 80000, "Castilla y León", "palentinos", "34003");
        Ciudad ciudad2 = new Ciudad("Burgos", 150000, "Castilla y León", "burgalés", "12345");
        Ciudad ciudad3 = new Ciudad("León", 180000, "Castilla y León", "leonés", "98765");
        Pais pais = new Pais("España", 45000000, "castellano", "Europa");
        pais.setCiudad(ciudad1);
        pais.setCiudad(ciudad2);
        pais.setCiudad(ciudad3);
        System.out.println(pais.getInfo());
        String ciudad4 = "Madrid";
        System.out.println(pais.getCiudad(ciudad4) ? ciudad4 + " pertenece a " + pais.getName()
                : ciudad4 + " NO pertenece a " + pais.getName());
        String ciudad5 = "Burgos";
        System.out.println(pais.getCiudad(ciudad5) ? ciudad5 + " pertenece a " + pais.getName()
                : ciudad5 + " NO pertenece a " + pais.getName());
    }

}