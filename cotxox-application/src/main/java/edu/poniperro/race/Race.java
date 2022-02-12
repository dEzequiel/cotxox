package edu.poniperro.race;

import edu.poniperro.drivers.Driver;
import edu.poniperro.drivers.PoolDrivers;

public class Race {
    private String creditCard = "";
    private String origin = "";
    private String destination = "";
    private double distance;
    private int expectedTime;
    private int raceTime;
    private int totalCost;
    private int tip;

    private Driver driver = null;
     

    public Race(String creditCard, String origin, String destination) {
        this.creditCard = creditCard;
        this.origin = origin;
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setExpectedTime(int expectedTime) {
        this.expectedTime = expectedTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void assignDriver(PoolDrivers driver) {
        setDriver(driver.assignDriver());
    }

    






}
