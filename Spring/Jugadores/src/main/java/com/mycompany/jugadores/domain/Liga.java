
package com.mycompany.jugadores.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="LIGA")
public class Liga implements Serializable {
    
    @OneToMany(mappedBy="liga")
    private Set<Equipo> equipos;
    
    @Id 
    @NotNull
    private String nombre;
    
    @NotNull
    private String localizacion;




    
    
    
    
    
}

