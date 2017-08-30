package com.fleetmgmt.management;

import com.fleetmgmt.location.Location;
import com.fleetmgmt.vehicle.Vehicle;

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
        vehicle.setFleetCompany(this.nameCompany);
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
            }
        }
        return result;
    }

    public int getTotalNumberOfFleet(){
        int number = 0;
        number = vehicleList.size();

        return number;
    }

    public int getNumberOfVehicleOnRoad(){
        int number = 0;
        for (Vehicle vehicle : vehicleList) {
            if(vehicle.isOnTheRoad())
                number++;
        }
        return number;
    }

    public int getFleetStock(){
        int number = 0;
        for (Vehicle vehicle : vehicleList) {
            if(!vehicle.isOnTheRoad())
                number++;
        }
        return number;
    }

    public Location findLocationByVehicle(Vehicle vehicle) {
        return vehicle.getLocation();
    }

    public Location findLocationByDriver(Driver driver) {
        Location findVehicle = null;

        for (Vehicle vehicle : vehicleList) {
            if(vehicle.getDiver().equals(driver)){
                findVehicle = vehicle.getLocation();
            }
        }

        return findVehicle;
    }



}
