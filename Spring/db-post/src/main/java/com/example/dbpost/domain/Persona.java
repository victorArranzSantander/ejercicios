package com.example.dbpost.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Data;


@Entity
@Table(name = "PERSONA")
@Data
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_PERSONA;
    @NotNull
    @NotEmpty
    private String NOMBRE;
    @NotNull
    @NotEmpty
    private String APELLIDOS;
    @NotNull
    private int TELEFONO;
    @NotNull
    @NotEmpty
    private String EMAIL;

    
}
