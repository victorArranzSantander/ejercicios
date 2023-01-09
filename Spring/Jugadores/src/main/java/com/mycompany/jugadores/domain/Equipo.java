
package com.mycompany.jugadores.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="EQUIPO")
public class Equipo implements Serializable {
    
    
    @Id 
    @NotNull
    private String nombre;
    
    @NotNull
    private double patrimonio;
    
    @ManyToOne
    @JoinColumn(name="Liga", nullable=false)
    Liga liga;
    
    @OneToMany(mappedBy="equipo")
    private Set<Jugador> jugadores;
    
    

    
    
    
    
}
