package br.com.hcode.solid.incorrect.vehicles;

public interface IVehicle {
    public void configureMotorcycle(String color, String year, double engine);
    public void configureCar(String color, String year, double engine, int seats);


    public void startVehicle();
}


