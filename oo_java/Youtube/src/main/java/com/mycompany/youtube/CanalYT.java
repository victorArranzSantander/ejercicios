
package com.mycompany.youtube;

import java.util.ArrayList;

public class CanalYT implements Observable{
    
    private ArrayList <Observer> suscriptores;
    private String video;
    
    public CanalYT(){
        suscriptores = new ArrayList <Observer> ();
    }

    public ArrayList<Observer> getSuscriptores() {
        return suscriptores;
    }
    
    @Override
    public String getVideo(){
        return this.video;
    }
    
    public void nuevoVideo(String video){
        this.video = video;
        notifyObservers();
    }
    
    
    public void addObserver(Observer observer){
        suscriptores.add(observer);
    }
    
    public void eliminarObserver(Observer observer){
        for (int i = 0; i < getSuscriptores().size(); i++){
            if (getSuscriptores().get(i).equals(observer)){
                getSuscriptores().remove(i);
            }
        }
    }
    
    public void notifyObservers(){
        /*for (int i = 0; i < getSuscriptores().size(); i++){
            getSuscriptores().get(i).update();
        }*/
        getSuscriptores().forEach((suscriptor) -> suscriptor.update());
    }
    
    
}
