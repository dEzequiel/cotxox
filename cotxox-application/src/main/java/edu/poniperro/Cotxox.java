package edu.poniperro;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.race.Race;
import edu.poniperro.drivers.*;

/**
 * Hello world!
 *
 */
public class Cotxox {

	public static void main(String[] args) {
		/*
		 * Configuracion del usuario
		 * y de la Race.
		 */

		String creditCard = "4916119711304546";
		String origin = "Aeroport Son Sant Joan";
		String destination = "Magaluf";
		double distance = 7.75;
		int expectedTime = 10; // minutes

		Race race = new Race(creditCard);
		race.setOrigin(origin);
		race.setDestination(destination);
		race.setDistance(distance);
		race.setExpectedTime(expectedTime);

		System.out.println("\n#####" + "\t Set Pickup: \t" + "#####\n");

		System.out.println("Visa: " + race.getCreditCard());
		System.out.println("From: " + race.getOrigin());
		System.out.println("To: " + race.getDestination());
		System.out.println("Distance: " + race.getDistance());

		System.out.println("\n#####" + "\t See your Cost: \t" + "#####\n");

		System.out.println("Visa: " + race.getCreditCard());
		System.out.println("From: " + race.getOrigin());
		System.out.println("To: " + race.getDestination());
		System.out.println("Distance: " + race.getDistance());
		System.out.println("Total: " + race.getExpectedTotalCost() + "€");

		System.out.println("\n#####" + "\t Get a Driver: \t" + "#####\n");

		// /**
		// * Necesitamos crear la flota de Driveres de donde seleccionar uno
		// * para ofrecer el servicio.
		// * La flota es un objeto de tipo PoolDriveres.
		// */

		List<Driver> poolDrivers = new ArrayList<Driver>();
		// Driver driver = null;

		// // creamos objetos Driver y los metemos en el array

		String[] names = { "Samantha", "Fox", "Mola" };
		for (String name : names) {
			Driver driver = new Driver(name);
			poolDrivers.add(driver);
		}

		String[] enrollments = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] models = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		for (Driver driver : poolDrivers) {
			driver.setEnrollment(enrollments[index]);
			driver.setModel(models[index]);
			// suponemos que las Driveras tienen una valoracion inicial de 4 stars
			driver.setRating((byte) 4);
			index++;
		}

		// // Creamos el objeto flota de Driveres, de la clase PoolDriveres.

		PoolDrivers drivers = new PoolDrivers(poolDrivers);

		// /* Seleccion del Driver en la flota y asignacion a la Race */

		race.assignDriver(drivers);
		// Race.asignarDriver(Driveres);

		// // Info por pantalla

		System.out.println("Driver: " + race.getDriver().getName());
		System.out.println("Type: " + race.getDriver().getModel());
		System.out.println("Matricula: " + race.getDriver().getEnrollment());
		System.out.println("Stars: " + race.getDriver().getAverageRating());
		System.out.println("From: " + race.getOrigin());
		System.out.println("To: " + race.getDestination());

		boolean ocupado = race.getDriver().isOccupied();

		if (ocupado) {
			System.out.println("Free for you");
		} else {
			System.out.println("Driver not free");
		}
		// // cancel ride
		// // contact by phone

		System.out.println("\n#####" + "\t Pay and Tip: \t" + "#####\n");

		race.makePayment(race.getExpectedTotalCost());
		race.receiveTip(1);
		race.releaseDriver();

		System.out.println("Driver: " + race.getDriver().getName());
		System.out.println("TIP: " + race.getTip());
		System.out.println("Visa: " + race.getCreditCard());
		System.out.println("Total: " + race.getTotalCost());
		System.out.println("Ocupado?: " + race.getDriver().isOccupied());

		System.out.println("\n#####" + "\t Rate your driver: \t" + "#####\n");

		race.getDriver().setRating((byte) 5);

		System.out.println("Driver: " + race.getDriver().getName());
		System.out.println("Stars: " + race.getDriver().getAverageRating());
	}
}
