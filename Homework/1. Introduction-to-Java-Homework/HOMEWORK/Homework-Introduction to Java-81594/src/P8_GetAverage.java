import java.util.Scanner;

public class P8_GetAverage {
    private static double findAverage(double x, double y, double z) {
        return (x + y + z) / 3;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number, please: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number, please: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number, please: ");
        double c = input.nextDouble();
        System.out.printf("Average = %.2f", findAverage(a, b, c));
    }
}