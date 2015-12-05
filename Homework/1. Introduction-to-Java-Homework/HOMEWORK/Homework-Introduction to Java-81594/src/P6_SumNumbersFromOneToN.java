import java.util.Scanner;

public class P6_SumNumbersFromOneToN {
    public static void main(String[] args) {
        System.out.print("Enter a number, please: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of all numbers from 1 to " + n + " is: " + sum);
    }
}