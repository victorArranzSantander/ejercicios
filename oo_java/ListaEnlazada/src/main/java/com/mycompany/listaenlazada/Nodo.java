
package com.mycompany.listaenlazada;


public class Nodo <T>{
    
    private String nombre;
    private Nodo <T> nodo;
    
    public Nodo(String nombre){
        this.nombre = nombre;
        nodo = null;
    }
    
    public Nodo(String nombre, Nodo nodo){
        this.nombre = nombre;
        this.nodo = nodo;
    }
    
}
