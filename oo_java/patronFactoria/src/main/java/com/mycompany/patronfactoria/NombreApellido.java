
package com.mycompany.patronfactoria;


public class NombreApellido extends Persona{
    
    private String nombreApellido;

    public NombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
        asignar();
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    
    @Override
    public void asignar(){
        String n = getNombreApellido();
        String delimitadores= " ";
        setNombre(n.split(delimitadores)[0].trim());
        setApellido(n.split(delimitadores)[1].trim());
    }
    
}
