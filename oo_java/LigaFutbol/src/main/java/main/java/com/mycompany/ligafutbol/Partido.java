package main.java.com.mycompany.ligafutbol;


public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private static int jornada = 0;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        jornada++;
    }


    private Equipo getEquipo1() {
        return this.equipo1;
    }


    private Equipo getEquipo2() {
        return this.equipo2;
    }


    private int getJornada() {
        return jornada;
    }


    public void jugarPartido() {
        int resultado = (int) (Math.round(Math.random() * 1));
        Equipo ganador = null;
        if (resultado == 0) {
            getEquipo1().sumarPuntos();
            ganador = getEquipo1();
        }
        else {
            getEquipo2().sumarPuntos();
            ganador = getEquipo2();
        }
        System.out.println(
                "Resultado correspondiente a la jornada " + getJornada() + " entre: " + getEquipo1().getNombre() + " y "
                        + getEquipo2().getNombre() + ": " + " Victoria del equipo " + ganador.getNombre()
        );
    }

}
