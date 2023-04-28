package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.factory.vehicles.Bike;
import br.com.hcode.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
