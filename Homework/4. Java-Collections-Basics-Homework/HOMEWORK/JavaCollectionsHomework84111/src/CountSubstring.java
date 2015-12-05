import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class CountSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine().toLowerCase();

        int occurrences = 0;
        for (int i = 0; i < text.length()-word.length()+1; i++) {
            String textSubstring = text.substring(i, i + word.length());

                if(textSubstring.equals(word)){
                occurrences++;
            }
         }
         System.out.println(occurrences);
    }
}
