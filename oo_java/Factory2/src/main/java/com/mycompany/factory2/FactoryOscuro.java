
package com.mycompany.factory2;


public class FactoryOscuro implements FactoryUI{
    
    @Override
    public Twitter abrirTwitter(){
        return new TwitterOscuro();
    }
    
    @Override
    public Instagram abrirInstagram(){
        return new InstagramOscuro();
    }
    
}
