
package com.mycompany.factory2;


public class Aplicacion{
    
    private FactoryUI factory;

    public Aplicacion(FactoryUI factory) {
        this.factory = factory;
    }
    
    public void pintar(){
        factory.abrirInstagram().pintar();
        factory.abrirTwitter().pintar();
    }


}
