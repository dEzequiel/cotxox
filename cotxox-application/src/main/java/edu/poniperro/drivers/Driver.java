package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.Math;

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setRating(double rating) {
        // Cast to parse int into byte.
        this.ratings.add((byte) rating);
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

    public double calculateAverageRating() {
        // Convert each stream to int with map() and intValue() and then sum().
        int sum = ratings.stream().mapToInt(i -> i.intValue()).sum();
        return (double) sum;
    }

    public void setAverageRating() {
        this.averageRating = calculateAverageRating();
    }

    public double getAverageRating() {
        return this.averageRating;
    }
}


