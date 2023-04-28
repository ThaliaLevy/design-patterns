package br.com.hcode.solid.ocp.correct2.vehicles;

public class Vehicle {
    protected String color;
    protected String year;
    protected double engine;

    void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
