package com.mycompany.juego;

public class Juego {
    private int vidas;
    private int vidasIni;;
    private int record = 0;

    public Juego(int vidasIni) {
        this.vidasIni = vidas;
        this.vidas = vidasIni;
    }

    public int getVidas() {
        return this.vidas;
    }

    private void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public boolean restarVida() {
        setVidas(getVidas() - 1);
        if (getVidas() > 0) {
            return true;
        } else {
            System.out.println("GAME OVER");
            return false;
        }
    }
    
    public void reiniciarJuego() {
        setVidas(vidasIni);
    }

    public void actualizarRecord() {
        if (getVidas() == getRecord()) {
            System.out.println("Ha igualado el récord!");
        }
        if (getVidas() > getRecord()) {
            setRecord(getVidas());
            System.out.println("NEW RECORD!!! " + getVidas());
        }
    }

    public int getVidasIni() {
        return this.vidasIni;
    }

    public void setVidasIni(int vidasIni) {
        this.vidasIni = vidasIni;
    }

    public int getRecord() {
        return this.record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    


}
