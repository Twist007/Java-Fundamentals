import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_WeirdScript {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int keyNum = Integer.parseInt(scan.nextLine()) % 52;
        if (keyNum == 0) {
            keyNum += 52;
        }

        if (keyNum < 27) {
            keyNum += 'a' - 1;
        } else {
            keyNum += 'A' - 26 - 1;
        }
        String key = (char) keyNum + "" + (char) keyNum;
        String text = "";

        String line = scan.nextLine();
        while (!line.equals("End")) {
            text += line;

            line = scan.nextLine();
        }
        String patternText = key + "(.*?)" + key;
        Pattern pat = Pattern.compile(patternText);
        Matcher matcher = pat.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}








