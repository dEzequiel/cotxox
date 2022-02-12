package edu.poniperro.race;

public class Race {
    private String creditCard = "";
    private String origin = "";
    private String destination = "";
    private double distance;
    private int expectedTime;
    private int raceTime;
    private int totalCost;
    private int tip;

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


}
