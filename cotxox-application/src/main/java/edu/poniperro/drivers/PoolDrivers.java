package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.List;

public class PoolDrivers {
    
    private List<Driver> drivers = new ArrayList<>();

    public PoolDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Driver> getPoolDrivers() {
        return this.drivers;
    }


}
