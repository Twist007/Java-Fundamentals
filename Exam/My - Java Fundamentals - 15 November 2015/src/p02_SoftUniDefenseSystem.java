import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_SoftUniDefenseSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalAlcohol = 0;

        String line = scan.nextLine();
        while (!line.equals("OK KoftiShans")) {
            Pattern pat = Pattern.compile("([A-Z][a-z]+).*?([A-Z][a-z]*[A-Z]).*?([\\d]+)L");
            Matcher matcher = pat.matcher(line);

            while (matcher.find()) {
                String name = matcher.group(1);
                String alcohol = matcher.group(2).toLowerCase();
                int quantity = Integer.parseInt(matcher.group(3));

                System.out.printf("%s brought %d liters of %s!\n", name, quantity, alcohol);

                totalAlcohol += quantity;
            }

            line = scan.nextLine();
        }

        System.out.printf("%.3f softuni liters", (totalAlcohol * 0.001));
    }
}
