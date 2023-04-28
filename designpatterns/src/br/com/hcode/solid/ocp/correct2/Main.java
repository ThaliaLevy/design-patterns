package br.com.hcode.solid.ocp.correct2;

import br.com.hcode.solid.ocp.correct2.vehicles.Car;
import br.com.hcode.solid.ocp.correct2.vehicles.Motorcycle;

public class Main {
	
    private static TypeVehicle typeVehicle;
    
    public static void main(String[] args) {
    	
    	typeVehicle = TypeVehicle.MOTORCYCLE;
	   // typeVehicle = TypeVehicle.CAR;

	    if(typeVehicle == TypeVehicle.CAR){
	       Car car = new Car("Prata", "2022", 2.6, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
			Motorcycle motorcycle = new Motorcycle("Vermelha", "2022", 250);
        }
    }
}
