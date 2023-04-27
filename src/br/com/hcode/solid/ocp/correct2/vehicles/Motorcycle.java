package br.com.hcode.solid.ocp.correct2.vehicles;

public class Motorcycle implements IVehicleMotorcycle {

	private String color;
	private String year;
	private double engine;

	public Motorcycle(String color, String year, double engine) {
		configureVehicle(color, year, engine);
	}

	@Override
	public void configureVehicle(String color, String year, double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;

		System.out.println("Criando um carro: " + this.color + " " + this.year + " " + this.engine);

		startVehicle();
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os motores");
	}

}
