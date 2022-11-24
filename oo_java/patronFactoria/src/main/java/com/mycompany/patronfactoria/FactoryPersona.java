
package com.mycompany.patronfactoria;


public class FactoryPersona implements Factory<Persona>{
    
    public Persona getInstance(String cadena){
        Persona p;
        if(cadena.indexOf(",") == -1){
            p = new NombreApellido(cadena);
        }
        else{
            p = new ApellidoNombre(cadena);
        }
        return p;
    }
    
}
