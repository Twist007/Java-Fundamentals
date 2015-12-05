import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n = Integer.parseInt(input.nextLine());
         int m = Integer.parseInt(input.nextLine());
         int min = Math.min(n,m);
         int max = Math.max(n,m);
        int[]arrayWithNums=new int[max-min+1];
        for (int i = 0; i <arrayWithNums.length; i++) {
            arrayWithNums[i] = min;
            min++;
        }
        Random rand = new Random();
        for (int i = 0; i <arrayWithNums.length ; i++) {
           int randomPosition = rand.nextInt(arrayWithNums.length);
            int temp = arrayWithNums[i];
            arrayWithNums[i] = arrayWithNums[randomPosition];
            arrayWithNums[randomPosition] = temp;
        }
        for (int i = 0; i <arrayWithNums.length ; i++) {
            System.out.print(arrayWithNums[i]+" ");
        }
    }
}
