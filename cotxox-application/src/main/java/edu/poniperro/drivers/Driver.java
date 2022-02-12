package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private final String name;
    private final String model;
    private final String enrollment;
    private double averageRating;
    private boolean isOccupied = false;
    private List<Byte> ratings = new ArrayList<Byte>();
}
