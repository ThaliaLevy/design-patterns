package br.com.hcode.solid.ocp.correct.vehicles;


public class Car extends Vehicle {
    private int seats;

    public Car(String color, String year, double engine, int seats){
    	this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        
        configureCar();
    }

    public void configureCar() {
        System.out.println("Criando um carro: "+ color + " " + year+ " "+ engine + " com " + seats + " assentos");
        startVehicle();
    }
}
