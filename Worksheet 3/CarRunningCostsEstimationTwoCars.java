public class CarRunningCostsEstimationTwoCars {
    public static void main(String[] args) {
        final double BUY_COST_CAR_1 = 12000;
        final double BUY_COST_CAR_2 = 18000;

        final double DISTANCE_TRAVELED = 100000; //km

        double fuelCostCar1 = 1.1;
        double kmPerLitreCar1 = 20;
        double serviceIntervalCar1 = 15000;
        double serviceCostCar1 = 100;

        double fuelCostCar2 = 1.4;
        double kmPerLitreCar2 = 35;
        double serviceIntervalCar2 = 25000;
        double serviceCostCar2 = 200;

        // Calculate number of services and cost of each service - car 1
        double serviceCount = DISTANCE_TRAVELED / serviceIntervalCar1;
        double serviceCost = serviceCount * serviceCostCar1;

        // Calculate fuel use and cost - car 1
        double usedFuel = DISTANCE_TRAVELED / kmPerLitreCar1;
        double fuelCost = usedFuel * fuelCostCar1;

        // Calculate total cost of ownership - car 1
        double totalCost = fuelCost + serviceCost + BUY_COST_CAR_1;
        System.out.println("Car 1: $" + totalCost);

        // Calculate number of services and cost of each service - car 2
        double serviceCount2 = DISTANCE_TRAVELED / serviceIntervalCar2;
        double serviceCost2 = serviceCount2 * serviceCostCar2;

        // Calculate fuel use and cost - car 2
        double usedFuel2 = DISTANCE_TRAVELED / kmPerLitreCar2;
        double fuelCost2 = usedFuel2 * fuelCostCar2;

        // Calculate total cost of ownership - car 2
        double totalCost2 = fuelCost2 + serviceCost2 + BUY_COST_CAR_2;
        System.out.println("Car 2: $" + totalCost2);
    }
}
