import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text : ");
        String text = scanner.nextLine().toLowerCase();
        System.out.print("Insert target word : ");
        String word = scanner.next().toLowerCase();

        int index = 0;
        int counter = 0;
        while (true) {
            int currentMatch = text.indexOf(word, index);
            if (currentMatch < 0) {
                break;
            }

            counter++;
            index = currentMatch + 1;
        }

        System.out.println(counter);
    }
}

