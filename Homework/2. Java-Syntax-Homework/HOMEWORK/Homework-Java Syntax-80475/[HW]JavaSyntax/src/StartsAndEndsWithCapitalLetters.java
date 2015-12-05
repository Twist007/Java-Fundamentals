import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        Pattern findWords = Pattern.compile("([A-Z][\\w]+[A-Z])");
        Matcher matches = findWords.matcher(sentence);
        List<String> output = new ArrayList<String>();
        while (matches.find()){
            output.add(matches.group());
        }
        for (int i = 0; i <output.size() ; i++) {
            System.out.println(output.get(i));
        }



    }
}

