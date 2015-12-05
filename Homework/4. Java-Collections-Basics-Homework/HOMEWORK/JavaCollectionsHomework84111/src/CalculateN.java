
import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class CalculateN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long factorial = calculateFactorial(num);
        System.out.printf("The factorial of %d is: %d", num, factorial);
    }

    private static long calculateFactorial(long num) {
        if(num == 1 || num == 0) {
            return 1;
        }

        return num * calculateFactorial(num - 1);
    }
}
