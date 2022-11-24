package com.mycompany.ejruedas;

public class Coche {
    
    private RuedasHomologadas ruedas;
    private Frenos frenos;

    public Coche() {
        this.ruedas = new Ruedas();
        this.frenos = new Frenos(1000);
    }

    public RuedasHomologadas getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(RuedasHomologadas ruedas) {
        this.ruedas = ruedas;
    }

    public Frenos getFrenos() {
        return this.frenos;
    }

    public void setFrenos(Frenos frenos) {
        this.frenos = frenos;
    }


    public void conducir() {
        getRuedas().rodar();
    }

    public void detenerse() {
        getFrenos().frenar();
    }




}
