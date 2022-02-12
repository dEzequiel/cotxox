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
}
