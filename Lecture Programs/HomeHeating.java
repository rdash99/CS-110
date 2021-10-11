public class HomeHeating {
    public static void main(String[] args){

        final double TEMP_DIFF = 21.0;
        final double HEAT_LOSS_THROUGH_FLOOR_M2_C = 0.5;
        final double HEAT_LOSS_THROUGH_WALL_M2_C = 0.5;
        final double HEAT_LOSS_THROUGH_ROOF_M2_C = 2.2;
        final double HEAT_LOSS_THROUGH_WINDOW_M2_C = 5.7;

        double width = 4.0;
        double length = 6.0;
        double height = 2.5;

        double windowHeight = 1.0;
        double windowWidth = 2.0;

        // Calculate heat loss through floor
        double floorArea = width * height;
        System.out.println(floorArea);
        double heatLossThroughFloor =
                floorArea * TEMP_DIFF * HEAT_LOSS_THROUGH_FLOOR_M2_C;
        System.out.println(heatLossThroughFloor);

        // Calculate heat loss through roof
        double roofArea = width * height;
        double heatLossThroughRoof =
                roofArea * TEMP_DIFF * HEAT_LOSS_THROUGH_ROOF_M2_C;
        System.out.println(heatLossThroughRoof);

        // Calculate heat loss through walls
        double wallArea = width * height * 2 + length * height * 2; //Remember 2 sides and 2 ends
        double heatLossThroughWalls =
                wallArea * TEMP_DIFF * HEAT_LOSS_THROUGH_WALL_M2_C;
        System.out.println(heatLossThroughWalls);

        //Calculate heat loss through window
        double windowArea = windowWidth * windowHeight;
        double heatLossThroughWindow =
                windowArea * TEMP_DIFF * HEAT_LOSS_THROUGH_WINDOW_M2_C;
        System.out.println(heatLossThroughWindow);

        //Calculate total heat loss
        double heatLoss =
                heatLossThroughFloor + heatLossThroughRoof
                + heatLossThroughWindow + heatLossThroughWalls;
        System.out.printf("Total heat loss: %.2f W\n", heatLoss/1000);
    }
}
