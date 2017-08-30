package com.fleetmgmt.vehicle;

import com.fleetmgmt.management.Driver;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Bus extends Vehicle {

    private String name;

    public Bus(String plateNumber, String model, Driver diver, int distance, int weight, String name) {
        super(plateNumber, model, diver, distance, weight);
        this.name = name;
    }
}
