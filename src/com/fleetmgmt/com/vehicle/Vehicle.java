package com.fleetmgmt.com.vehicle;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Vehicle {

    private String plateNumber;
    private String model;
    private String diver;
    private int distance;
    private int wight;
    private boolean isOnTheRoad = false;

    public Vehicle(String plateNumber, String model, String diver, int distance, int wight) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.diver = diver;
        this.distance = distance;
        this.wight = wight;
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

    public String getDiver() {
        return diver;
    }

    public void setDiver(String diver) {
        this.diver = diver;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public void setOnTheRoad(boolean onTheRoad) {
        isOnTheRoad = onTheRoad;
    }

    public String getPlateNumber() {
        return plateNumber;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", distance=" + distance +
                ", wight=" + wight +
                '}';
    }
}
