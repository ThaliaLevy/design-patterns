package br.com.hcode.solid.correct;

import br.com.hcode.solid.correct.vehicles.Car;
import br.com.hcode.solid.correct.vehicles.Motorcycle;

public class Main {
    private static String type;
    public static void main(String[] args) {

		type = "Motorcycle";
		
		if (type == "Car") {
			Car car = new Car("Prata", "2022", 2.6, 4);
		} else {
			Motorcycle motorcycle = new Motorcycle("Vermelha", "2022", 250);
		}

	}
}
