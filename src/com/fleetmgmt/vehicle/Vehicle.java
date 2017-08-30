package com.fleetmgmt.vehicle;

import com.fleetmgmt.location.Location;
import com.fleetmgmt.management.Driver;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Vehicle {

    private String plateNumber;
    private String model;
    private String fleetCompany;
    private Driver diver;
    private int distance;
    private int weight;
    private boolean isOnTheRoad = false;
    private Location location;

    public Vehicle() {
    }

    public Vehicle(String plateNumber, String model, Driver diver, int distance, int weight) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.diver = diver;
        this.distance = distance;
        this.weight = weight;
    }

    public boolean isOnTheRoad() {
        return isOnTheRoad;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDiver() {
        return diver;
    }

    public void setDiver(Driver diver) {
        this.diver = diver;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWight(int wight) {
        this.weight = wight;
    }

    public void setOnTheRoad(boolean onTheRoad) {
        isOnTheRoad = onTheRoad;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getFleetCompany() {
        return fleetCompany;
    }

    public void setFleetCompany(String fleetCompany) {
        this.fleetCompany = fleetCompany;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", distance=" + distance +
                ", wight=" + weight +
                '}';
    }
}
