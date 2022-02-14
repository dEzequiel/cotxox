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

    public String getDestination() {
        return this.destination;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setExpectedTime(int expectedTime) {
        this.expectedTime = expectedTime;
    }

    public int getExpectedTime() {
        return this.expectedTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }

    public int getRaceTime() {
        return this.raceTime;
    }

    public int getTotalCost() {
        return this.totalCost;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Driver getDriver() {
        return this.driver;
    }

    public void assignDriver(PoolDrivers poolDrivers) {
        setDriver(poolDrivers.assignDriver());
    }

    public void makePayment(double payment) {
        this.totalCost -= payment;
    }

    public void receiveTip(int tip) {
        this.tip = tip;
    }

    public void releaseDriver() {
        getDriver().setOccupied(false);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.getDriver());
        return output.toString();
    }
}
