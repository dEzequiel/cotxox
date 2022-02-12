package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {

    private String name = null;
    private String model = null;
    private String enrollment = null;
    private double averageRating;
    private boolean isOccupied = false;
    private List<Byte> ratings = new ArrayList<>();
    
    public Driver(){

    };

    public Driver(String name, String model, String enrollment) {
        this.name = name;
        this.model = model;
        this.enrollment = enrollment;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setRating(int rating) {
        // Cast to parse int into byte.
        this.ratings.add((byte) rating);
    }

    public void setOccupied(boolean status) {
        this.isOccupied = status;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    // private double calculateAverageRating() {
        
    // }
}


