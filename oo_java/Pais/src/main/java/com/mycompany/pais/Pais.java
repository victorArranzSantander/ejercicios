package com.mycompany.pais;

import java.util.ArrayList;


public class Pais {

    private String name;
    private int hab;
    private String lang;
    private String cont;
    ArrayList<Ciudad> ciudades = new ArrayList <Ciudad>();

    public Pais(String name, int hab, String lang, String cont) {
        this.name = name;
        this.hab = hab;
        this.lang = lang;
        this.cont = cont;
    }

    public ArrayList <Ciudad>  getCiudades() {
        return this.ciudades;
    }

    public void setCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHab() {
        return this.hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCont() {
        return this.cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public boolean getCiudad(String ciudad) {
        boolean encontrado = false;
        for (int i = 0; i < getCiudades().size(); i++) {
            if (getCiudades().get(i).getName().equals(ciudad)) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public String getInfo() {
        String info = getName() + "\n";
        for (int i = 0; i < getCiudades().size(); i++) {
            info += "\n" + getCiudades().get(i).getInfo();
        }
        return info;
    }


}
