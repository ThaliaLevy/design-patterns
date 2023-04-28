package br.com.hcode.solid.incorrect;

import br.com.hcode.solid.incorrect.vehicles.Car;
import br.com.hcode.solid.incorrect.vehicles.Motorcycle;

public class Main {
    private static String type;
    public static void main(String[] args) {

        type = "Motorcycle";
        
		if (type == "Car") {
			Car car = new Car("Azul", "2022", 2.6, 4);
		} else {
			Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
		}

	}
}
