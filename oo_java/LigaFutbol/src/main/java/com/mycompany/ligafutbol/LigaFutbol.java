package com.mycompany.ligafutbol;

import java.util.ArrayList;
import java.util.Collections;

import main.java.com.mycompany.ligafutbol.Equipo;
import main.java.com.mycompany.ligafutbol.Partido;

public class LigaFutbol {

    public static ArrayList<Equipo> equipos = new ArrayList <Equipo>();
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Real Madrid", 1902);
        Equipo equipo2 = new Equipo("Palencia Cristo Atlético", 1987);
        Equipo equipo3 = new Equipo("Fútbol Club Barcelona", 1899);
        Equipo equipo4 = new Equipo("Real Valladolid", 1928);
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        Partido partido1 = new Partido(equipo1, equipo3);
        partido1.jugarPartido();
        Partido partido2 = new Partido(equipo2, equipo4);
        partido2.jugarPartido();
        Partido partido3 = new Partido(equipo1, equipo2);
        partido3.jugarPartido();
        Partido partido4 = new Partido(equipo3, equipo4);
        partido4.jugarPartido();
        Partido partido5 = new Partido(equipo1, equipo4);
        partido5.jugarPartido();
        Partido partido6 = new Partido(equipo2, equipo3);
        partido6.jugarPartido();
        clasificacion(equipos);
    }

    public static void clasificacion(ArrayList<Equipo> equipos) {
        Collections.sort(equipos, Collections.reverseOrder());
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombre() + ": " + equipos.get(i).getPuntos());
        }
    }
}
