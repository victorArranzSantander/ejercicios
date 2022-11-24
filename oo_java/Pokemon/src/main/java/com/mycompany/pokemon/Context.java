
package com.mycompany.pokemon;

import java.util.ArrayList;

public class Context {
    
    private ArrayList<Strategy> ataques;

    
    public Context(){
        this.ataques = new ArrayList <Strategy>();
    }

    private ArrayList<Strategy> getAtaques() {
        return ataques;
    }

    
    public void anadirAtaque(Strategy ataque){
        getAtaques().add(ataque);
    }
    
    public void eliminarAtaque(Strategy ataque){
        for (int i = 0; i < ataques.size(); i++){
            if (ataques.get(i).equals(ataque)){
                ataques.remove(i);
                break;
            }
        }  
    }
    
    public Strategy getAtaque(int i){
        return getAtaques().get(i);
    }
    
}
