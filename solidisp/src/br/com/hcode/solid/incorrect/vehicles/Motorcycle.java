package br.com.hcode.solid.incorrect.vehicles;

public class Motorcycle implements IVehicle{
    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine){
        configureMotorcycle(color, year, engine);
    }
    
	@Override
	public void configureCar(String color, String year, double engine, int seats) {}

	@Override
	public void configureMotorcycle(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		
		System.out.println("Criando uma moto: " + color + " " + year + " " + engine);
		startVehicle();
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os motores!");		
	}

}
