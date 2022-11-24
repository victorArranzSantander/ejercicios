
package com.mycompany.patronfactoria;


abstract class Persona {
    
    private String nombre;
    private String apellido;

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void info(){
        System.out.println("Mi nombre es " + getNombre() + " y mi apellido es " + getApellido());
    }
    
    public abstract void asignar();
    
}
