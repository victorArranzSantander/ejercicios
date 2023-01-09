
package com.mycompany.jugadores.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="MARCA")
public class Marca implements Serializable {
    
    @Id 
    @NotNull
    private String marca;
    
    @OneToMany(mappedBy = "marca")
    Set<JugadorMarca> marcaJugador;
    
    
    
}