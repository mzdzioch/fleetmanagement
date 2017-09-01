package com.fleetmgmt.app;

import com.fleetmgmt.location.Location;
import com.fleetmgmt.management.Management;
import com.fleetmgmt.tools.VehicleFactory;
import com.fleetmgmt.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleList = vehicleFactory.getVehicles();

        Management fleetCompany = new Management("CarRent");

        for (Vehicle vehicle : vehicleList) {
            fleetCompany.addVehicle(vehicle);
        }

        System.out.println("Total number of fleet vehicles: " + fleetCompany.getTotalNumberOfFleet());
        System.out.println("Number vehicles at work: " +fleetCompany.getNumberOfVehicleOnRoad());
        System.out.println("Number of vehicles ready to fleet: " +fleetCompany.getFleetStock());
        System.out.println("The vehicle with plate numbers KR89233: " + fleetCompany.getVehicleByPlate("KR89233") + " "  + fleetCompany.getVehicleByPlate("KR89233").getDiver());

        String driverName = "Kowalski";
        Location location = new Location();
          location = fleetCompany.findLocationByDriver(driverName);

        System.out.println("The location of vehicle drive by " + driverName + "  " +  location);


        String vehicleName = "car3";
        location = fleetCompany.findLocationByVehicle(vehicleName);

        System.out.println("Car name: " + vehicleName + " " + location);
        ;

    }
}
