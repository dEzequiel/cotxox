package edu.poniperro.race;

import edu.poniperro.drivers.Driver;
import edu.poniperro.drivers.PoolDrivers;

public class Race {
    private String creditCard;
    private String origin;
    private String destination;
    private double distance;
    private int expectedTime;
    private int raceTime;
    private int totalCost;
    private int tip;

    private Driver driver = null;
     
    public Race() {
    }

    public Race(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCard() {
        return this.creditCard;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
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
    public Driver getDriver() {
        return this.driver;
    }

    public void assignDriver(PoolDrivers driver) {
        setDriver(driver.assignDriver());
    }
}
