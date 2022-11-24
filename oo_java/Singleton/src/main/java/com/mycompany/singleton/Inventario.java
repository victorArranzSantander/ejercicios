
package com.mycompany.singleton;


public class Inventario {
 
    private static Inventario inventario;
    private static int tornillos;
    private static int tuercas;
    private static int arandelas;

    private Inventario() {

    }

    private static int getTornillos() {
        return tornillos;
    }

    public static int getTuercas() {
        return tuercas;
    }

    public static int getArandelas() {
        return arandelas;
    }
    
    public static Inventario getInventario(){
        return inventario;
    }

    public static void setInventario(Inventario inventario) {
        Inventario.inventario = inventario;
    }

    public void setTornillos(int tornillos) {
        this.tornillos = tornillos;
    }

    public void setTuercas(int tuercas) {
        this.tuercas = tuercas;
    }

    public void setArandelas(int arandelas) {
        this.arandelas = arandelas;
    }
    
    public void getInfo(){
        System.out.println("En el almacen hay: \n" + "Tornillos: " + getTornillos() + "\nTuercas: " + getTuercas() + "\nArandelas: " + getArandelas());
    }
    
    public static Inventario getInstance(){
        if (getInventario() == null){
            setInventario(new Inventario());
        }
        else{
            System.out.println("No se puede crear un segundo inventario.");
        }
        return getInventario();
    }
        
       
    
    
}
