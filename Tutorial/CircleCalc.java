import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        final double PI = 3.14159265358979323846264;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = in.nextDouble();

        double circumference = PI * (radius * 2);
        System.out.println("The circumference of the circle is: " + circumference);

        double area = PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
        
    }
}
