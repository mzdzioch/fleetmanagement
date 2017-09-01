package com.fleetmgmt.tools;

import com.fleetmgmt.location.Location;
import com.fleetmgmt.management.Driver;
import com.fleetmgmt.vehicle.Bus;
import com.fleetmgmt.vehicle.Car;
import com.fleetmgmt.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mzdzioch on 2017-08-31.
 */
public class VehicleFactory {

    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles(){

        vehicles.add(new Car("KR85414", "Hyundai C40", new Driver("Jan", "Kowalski"), 14000, 1100, "car1"));
        vehicles.add(new Car("KR89230", "Opel Insignia", new Driver("Piotr", "Niemczyk"), 9000, 1500, "car2"));
        vehicles.add(new Car("KR89231", "Opel Insignia", new Driver("Franek", "Czarnecki"), 90000, 1500, "car3"));
        vehicles.add(new Car("KR89232", "Opel Insignia", new Driver("Mariusz", "Czpla"), 100000, 1500, "car4"));
        vehicles.add(new Car("KR89233", "Opel Insignia", new Driver("Piotr", "Niemczyk"), 4000, 1500, "car5"));
        vehicles.add(new Car("KR89234", "Opel Insignia", new Driver("Piotr", "Niemczyk"), 70000, 1500, "car6"));
        vehicles.add(new Bus("KR85413", "Opel", new Driver("Piotr", "Maguła"), 12000, 12000, "bus1"));
        vehicles.add(new Bus("KR85412", "Opel", new Driver("Piotr", "Maguła"), 100000, 10000, "bus2"));


        for (Vehicle vehicle : vehicles) {
            vehicle.setLocation(new Location(24.3454523, 10.123450));
        }

        vehicles.get(2).setLocation(new Location(69.3454523, 50.123450));
        vehicles.get(2).setOnTheRoad(true);

        return vehicles;
    }
}
