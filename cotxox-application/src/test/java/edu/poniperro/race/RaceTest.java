package edu.poniperro.race;
import edu.poniperro.drivers.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RaceTest {
    
    @Test
    public void assignDriver() {
        Race race = new Race();
        List<Driver> Drivers = new ArrayList<Driver>();
        PoolDrivers poolDrivers = new PoolDrivers(Drivers);

        String[] nombres = { "Samantha", "Fox", "Mola" };
		for (String nombre : nombres) {
			Driver driver = new Driver(nombre);
            poolDrivers.getPoolDrivers().add(driver);
        }

        assertEquals(3, poolDrivers.getPoolDriversSize());

        race.assignDriver(poolDrivers);
        System.out.println(race.toString()); // Prints the name of one driver, Samantha, Fox or Mola. That's the race assigned driver.
    }
}
