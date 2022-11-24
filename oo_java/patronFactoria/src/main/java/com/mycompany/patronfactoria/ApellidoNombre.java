package com.mycompany.patronfactoria;


public class ApellidoNombre extends Persona{
    
    private String apellidoNombre;

    public ApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
        asignar();
    }
    
    public String getApellidoNombre() {
        return apellidoNombre;
    }
    
    @Override
    public void asignar(){
        String n = getApellidoNombre();
        String delimitadores= ",";
        setNombre(n.split(delimitadores)[1].trim());
        setApellido(n.split(delimitadores)[0].trim());
    }
    
}
