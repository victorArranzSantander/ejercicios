package main.java.com.mycompany.coche;

public class CocheElectrico implements Coche{

    private Motor motor = new Motor(2000);


    public void encenderMotor() {
        System.out.println("Exception");
    }

    public void acelerar() {
        motor.revolucionar();
    }

}