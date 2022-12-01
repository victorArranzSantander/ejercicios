
package domain;

import lombok.Data;


@Data
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;

    public Persona(String nombre, String apellidos, String email, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    
    
    
    
}
