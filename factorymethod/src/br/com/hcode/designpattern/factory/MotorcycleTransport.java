package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.factory.vehicles.IVehicle;
import br.com.hcode.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
