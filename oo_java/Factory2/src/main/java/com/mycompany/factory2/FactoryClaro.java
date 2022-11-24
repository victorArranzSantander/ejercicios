
package com.mycompany.factory2;


public class FactoryClaro implements FactoryUI{

    @Override
    public Twitter abrirTwitter(){
        return new TwitterClaro();
    }
    
    @Override
    public Instagram abrirInstagram(){
        return new InstagramClaro();
    }
}
