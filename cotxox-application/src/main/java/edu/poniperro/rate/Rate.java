package edu.poniperro.rate;
import edu.poniperro.race.*;

public class Rate {
    static final double MILE_COST = 1.35;
    static final double MINUTE_COST = 0.35;
    static final double MIN_COST = 5.0;
    static final byte PERCENTATGE_COMISSION = 20;


    public Rate() {};

    public static double getCostDistance(double distance) {
        return distance * MILE_COST;
    }

    public static double getCostTime(int time) {
        return time * MINUTE_COST;
    }

    public static double getExpectedTotalCost(Race race) {
        double totalCost = getCostDistance(race.getDistance()) + getCostTime(race.getExpectedTime());
       
        // variable = Expression1 ? Expression2: Expression3
        return totalCost > MIN_COST ? totalCost : MIN_COST;

    }
}
