
package com.mycompany.youtube;

public interface Observable {
    
    public void addObserver(Observer observer);
    public void eliminarObserver(Observer observer);
    public String getVideo();
    
}
