package com.fleetmgmt.management;

import com.fleetmgmt.com.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Management {

    String nameCompany;

    public Management(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        System.out.println("A new vehicle has been added");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
        System.out.println("The vehicle has been removed");
    }

    public Vehicle getVehicleByPlate(String plateNumber) {
        Vehicle result = null;

        for (Vehicle vehicle : vehicleList) {
            if(vehicle.getPlateNumber().equals(plateNumber)) {
                result = vehicle;
                break;
            } else
                System.out.println("A vehicle does not exist in the database");
        }
        return result;
    }

    public int getTotalNumberOfVehicles(){
        int number = 0;
        number = vehicleList.size();

        return number;
    }

    public int getNumberOfVehicle(){
        int number = 0;

        return number;
    }



}
