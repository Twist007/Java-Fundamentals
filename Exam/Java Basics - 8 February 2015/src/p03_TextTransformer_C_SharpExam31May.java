import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_TextTransformer_C_SharpExam31May {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        String line = scan.nextLine();
        while (!line.equals("burp")) {
            stringBuilder.append(line);
            line = scan.nextLine();
        }

        String finalString = stringBuilder.toString();
        finalString = finalString.replaceAll("\\s+", " ");

        Pattern pattern = Pattern.compile("([$'%&])([^$'%&]+)+\\1");
        Matcher matcher = pattern.matcher(finalString);

        StringBuilder outputString = new StringBuilder();
        while (matcher.find()) {
            char specialChar = matcher.group(1).charAt(0);
            int weight = getWeight(specialChar);
            String capture = matcher.group(2);

            for (int index = 0; index < capture.length(); index++) {
                char nextChar = capture.charAt(index);
                char newChar;
                if (index % 2 == 0) {
                    newChar = (char) (weight + nextChar);
                } else {
                    newChar = (char) (nextChar - weight);
                }
                outputString.append(newChar);
            }
           outputString.append(" ");
        }
        System.out.println(outputString.toString());
    }

    private static int getWeight(char specialChar) {
        switch (specialChar) {
            case '$':
                return 1;
            case '%':
                return 2;
            case '&':
                return 3;
        }
        return 4;
    }
}








