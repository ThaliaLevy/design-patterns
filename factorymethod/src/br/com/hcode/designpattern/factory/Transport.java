package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
