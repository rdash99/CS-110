public class CarRunningCostsEstimation1 {
    public static void main(String[] args){
        final double BUY_COST = 12000;
        final double FUEL_COST = 1.1;
        final double KM_PER_LITRE = 20;
        final double DISTANCE_TRAVELED = 100000;
        final double SERVICE_INTERVAL = 15000;
        final double SERVICE_COST = 100;

        // Calculate number of services and cost of each service
        double serviceCount = DISTANCE_TRAVELED / SERVICE_INTERVAL;
        double serviceCost = serviceCount * SERVICE_COST;

        // Calculate fuel use and cost
        double usedFuel = DISTANCE_TRAVELED / KM_PER_LITRE;
        double fuelCost = usedFuel * FUEL_COST;

        // Calculate total cost of ownership
        double totalCost = fuelCost + serviceCost + BUY_COST;
        System.out.println(totalCost);
    }
}