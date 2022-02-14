package edu.poniperro.drivers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.poniperro.race.Race;

public class PoolDriversTest {

    @Test
    public void poolDriversSize() {
        Driver driver1 = new Driver("e");
        Driver driver2 = new Driver("a");

        List<Driver> poolDrivers = new ArrayList<Driver>();
        poolDrivers.add(driver1);
        poolDrivers.add(driver2);

        assertEquals(2, poolDrivers.size());   
    }

    @Test
    public void assignDriver() {
        
        Race race1 = new Race();
        List<Driver> Drivers = new ArrayList<Driver>();
        PoolDrivers poolDrivers = new PoolDrivers(Drivers);

        String nombre = "Samantha";
        Driver driver = new Driver(nombre);
        poolDrivers.getPoolDrivers().add(driver);
        race1.assignDriver(poolDrivers);
        
        assertEquals(true, race1.getDriver().isOccupied());
        }

    }
