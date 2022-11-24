package main.java.com.mycompany.ligafutbol;


public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int puntos;
    private int fundacion;

    public Equipo(String nombre, int fundacion) {
        this.nombre = nombre;
        this.puntos = 0;
        this.fundacion = fundacion;
    }

    @Override
    public int compareTo(Equipo e){
        if(e.getPuntos() > puntos){
            return -1;
        }else if(e.getPuntos() == puntos){
            return 0;
        }else{
            return 1;
        }
    }

    public String getNombre() {
        return this.nombre;
    }


    public int getPuntos() {
        return this.puntos;
    }

    private void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    private int getFundacion() {
        return this.fundacion;
    }

    public String getInfo() {
        return getNombre() + " (fundado en " + getFundacion() + ")";
    }


    public void sumarPuntos() {
        setPuntos(getPuntos() + 3);
    }

}