package com.fleetmgmt.management;

/**
 * Created by mzdzioch on 2017-08-30.
 */
public class Driver {

    private String firstName;
    private String secondName;

    public Driver(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Kierowcą samochodu jest: " +
                 firstName + " " + secondName;
    }
}
