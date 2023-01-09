
package com.mycompany.jugadores.exceptions;


public class JugadorNoExisteException extends Exception{
   public JugadorNoExisteException(String errMsg){
       super(errMsg);
   }
}
