import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_ShmoogleCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(int|double)\\s([a-z][A-z]*)");
        ArrayList<String> doubles = new ArrayList<>();
        ArrayList<String> ints = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("//END_OF_CODE")) {

            Matcher match = pattern.matcher(line);
            while (match.find()) {
                String variable = match.group(1);
                String name = match.group(2);

                if (variable.equals("double")) {
                    doubles.add(name);
                } else {
                    ints.add(name);
                }
            }
            line = scanner.nextLine();
        }
        Collections.sort(doubles);
        Collections.sort(ints);

        System.out.printf("Doubles: %s\n", doubles.size() > 0 ? String.join(", ", doubles) : "None");
        System.out.printf("Ints: %s\n", ints.size() > 0 ? String.join(", ", ints) : "None");
    }
}
