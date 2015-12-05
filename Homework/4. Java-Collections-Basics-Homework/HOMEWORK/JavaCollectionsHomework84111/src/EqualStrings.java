import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class EqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split("\\s");
        for (int i = 0; i < input.length; i++) {
            String currentStr = input[i];
            System.out.print(currentStr);

            for (int j = i + 1; j < input.length; j++) {
                String compareStr = input[j];
                if (compareStr.equals(currentStr)) {
                    System.out.print(" " + compareStr);
                    i++;
                }
            }
            System.out.println();
        }
    }
}
