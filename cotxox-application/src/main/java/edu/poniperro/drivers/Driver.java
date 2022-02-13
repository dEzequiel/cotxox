package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.List;


public class Driver {

    private String name = null;
    private String model = null;
    private String enrollment = null;
    private double averageRating;
    private boolean isOccupied = false;
    private List<Byte> ratings = new ArrayList<>();
    
    public Driver(){

    };

    public Driver(String name) {
        this.name = name;
        // this.model = model;
        // this.enrollment = enrollment;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setRating(double rating) {
        // Cast to parse int into byte.
        this.ratings.add((byte) rating);
        this.averageRating = this.calculateAverageRating();
    }

    public List<Byte> getRatings() {
        return this.ratings;
    }

    public void setOccupied(boolean status) {
        this.isOccupied = status;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    private double calculateAverageRating() {
        // Convert each stream to int with map() and intValue() and then sum().
        double sum = ratings.stream().mapToInt(i -> i.intValue()).sum();
        return sum / this.getRatings().size();
    }

    public void setAverageRating() {
        this.averageRating = calculateAverageRating();
    }

    public double getAverageRating() {
        return this.averageRating;
    }
}


