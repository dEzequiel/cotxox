package edu.poniperro.drivers;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DriverTest {
    

    @Test
    public void calculateAverageRating() {

        Driver driver = new Driver("e");
        driver.setRating(1);
        driver.setRating(3);
        driver.setRating(1);

        assertEquals(3, driver.getRatingNumbers());
        System.out.println(driver.getAverageRating());

    }

}
