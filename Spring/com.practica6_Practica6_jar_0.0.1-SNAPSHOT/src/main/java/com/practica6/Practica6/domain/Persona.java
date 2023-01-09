package com.practica6.Practica6.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author danie
 */
@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID=1L;
    @Id //Con esto le indicamos cual es la clave primaria de la tabla persona
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con esto le indicamos la estrategia para crear la clave primaria(recuerda que era AUTO_INCREMENT)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellidos;
    
    
    private int telefono;
    
    @NotEmpty
    private String email;
}
