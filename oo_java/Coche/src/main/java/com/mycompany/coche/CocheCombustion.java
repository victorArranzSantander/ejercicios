package main.java.com.mycompany.coche;

public class CocheCombustion implements Coche{

    private Motor motor = new Motor(1000);


    public void encenderMotor() {
        motor.arrancar();
    }

    public void acelerar() {
        motor.revolucionar();
    }

}