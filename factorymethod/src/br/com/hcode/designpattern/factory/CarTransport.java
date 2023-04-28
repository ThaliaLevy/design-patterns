package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.factory.vehicles.Car;
import br.com.hcode.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
