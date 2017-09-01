package com.fleetmgmt.vehicle;

import com.fleetmgmt.management.Driver;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Car extends Vehicle {

       public Car(String plateNumber, String model, Driver diver, int distance, int weight, String name) {
        super(plateNumber, model, diver, distance, weight, name);
    }
}
