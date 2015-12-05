import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        Pattern words = Pattern.compile("(([a-zA-z]+))");
        Matcher match =words.matcher(sentence);
        List<String> matchedWords = new ArrayList<String>();
        while(match.find()){
            matchedWords.add(match.group());
        }
        for (int i = 0; i <matchedWords.size() ; i++) {
            System.out.printf("%s ",matchedWords.get(i));
        }
    }
}
