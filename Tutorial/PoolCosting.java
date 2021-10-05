import java.util.Scanner;

public class PoolCosting {
    public static void main(String[] args) {

        //costs - fixed
        final int EXC_COST_PER_CUBIC_METRE = 20;
        final int LINE_TILE_COST_PER_SQR_METRE = 25;
        final int MACHINERY_COST = 1000;
        
        Scanner in = new Scanner(System.in);

        //Enter pool size data
        System.out.print("Enter the depth: ");
        int depth = in.nextInt();
        System.out.print("Enter the Length: ");
        int length = in.nextInt();
        System.out.print("Enter the width: ");
        int width = in.nextInt();

        // Volume calculation
        int volume = depth * width * length;

        //Excavation Costs
        int excCost = volume * EXC_COST_PER_CUBIC_METRE;
        
        //Tiling and lining costs
        int baseArea = width * length;
        int endArea = width * depth * 2;
        int sideArea = length * depth * 2;
        int lineTileCost = (baseArea + endArea + sideArea) * LINE_TILE_COST_PER_SQR_METRE;

        //total costs
        int totalCost = excCost + lineTileCost + MACHINERY_COST;
        
        System.out.println("Estimated cost: £" + totalCost);

    }
}
