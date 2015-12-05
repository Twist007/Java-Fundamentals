import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);

        TreeSet<String> results = new TreeSet<>();
        while (matcher.find()) {
            results.add(matcher.group());
        }

        for (String result : results) {
            System.out.print(result + " ");
        }
    }
}
