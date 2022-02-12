package edu.poniperro.drivers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PoolDrivers {
    
    private List<Driver> drivers = new ArrayList<Driver>();
    
    public PoolDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Driver> getPoolDrivers() {
        return this.drivers;
    }

    public Driver assignDriver() {
        Driver driver = new Driver();
        int PoolDriverNumber = ThreadLocalRandom.current().nextInt(getPoolDrivers().size());

        while(driver.isOccupied() == false) {
            driver = getPoolDrivers().get(PoolDriverNumber); //Getting array driver object
            if (!driver.isOccupied()) {
                driver.setOccupied(true);
            }
        }

        return driver;
    }
}