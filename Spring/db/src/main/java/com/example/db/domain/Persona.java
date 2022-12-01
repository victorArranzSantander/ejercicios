package com.example.db.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Entity
@Table(name = "PERSONA")
@Data
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_PERSONA;
    private String NOMBRE;
    private String APELLIDOS;
    private int TELEFONO;
    private String EMAIL;

    
}
