import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullText = scanner.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+@[a-zA-Z0-9]+[a-zA-Z0-9\\.]+[a-zA-Z0-9]+)");
        Matcher email = pattern.matcher(fullText);
        while (email.find()){
            System.out.println(email.group(1));
        }

    }
}
