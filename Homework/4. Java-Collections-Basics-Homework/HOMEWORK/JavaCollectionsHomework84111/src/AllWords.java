import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class AllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().trim().split("[^a-zA-Z]+");
        System.out.println(words.length);
    }
}
