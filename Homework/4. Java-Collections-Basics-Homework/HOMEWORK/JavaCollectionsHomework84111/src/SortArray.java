
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert n: ");
        int n = input.nextInt();
        System.out.printf("Insert integers: ", n);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        for(int num : numbers) {
            System.out.print(num + " ");
        }


    }
}
