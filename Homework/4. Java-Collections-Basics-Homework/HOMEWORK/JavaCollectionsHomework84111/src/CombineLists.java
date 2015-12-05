import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class CombineLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text line 1: ");
        String l1 = scanner.nextLine();
        System.out.print("Insert text line 2: ");
        String l2 = scanner.nextLine();
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < l1.length(); i++) {
            char currentChar = l1.charAt(i);
            if(currentChar != ' ') {
                result.add(currentChar);
            }
        }

        for (int i = 0; i < l2.length(); i++) {
            char currentChar = l2.charAt(i);
            if(currentChar != ' ' && !l1.contains("" + currentChar)) {
                result.add(currentChar);
            }
        }

        for (Character ch : result) {
            System.out.print(ch + " ");
        }
    }
}
