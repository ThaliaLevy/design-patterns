package br.com.hcode.solid.ocp.correct;

import br.com.hcode.solid.ocp.correct2.vehicles.Car;
import br.com.hcode.solid.ocp.correct2.vehicles.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;
    
    public static void main(String[] args) {
    	
	    typeVehicle = TypeVehicle.MOTORCYCLE;
	    //typeVehicle = TypeVehicle.CAR;

	    if(typeVehicle == TypeVehicle.CAR){
	       Car car = new Car("Amarelo", "2021", 2.5, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
			Motorcycle motorcycle = new Motorcycle("Preto", "2021", 250);
        }
    }
}
