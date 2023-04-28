package br.com.hcode.solid.ocp.incorrect;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
	    typeVehicle = TypeVehicle.CAR;

	    if(typeVehicle == TypeVehicle.CAR){
	    	Vehicle vehicle = new Vehicle("Azul", "2022", 2.6, 4);
	    	vehicle.car();
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
	        Vehicle vehicle = new Vehicle("", "2022", 250, 1);
	        vehicle.motorcycle();
        }
    }
}
