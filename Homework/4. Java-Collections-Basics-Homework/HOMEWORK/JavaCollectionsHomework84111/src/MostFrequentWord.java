import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);

        TreeMap<String, Integer> results = new TreeMap<>();
        int frequency = 0;
        while (matcher.find()) {
            String currentWord = matcher.group();
            if(!results.containsKey(currentWord)) {
                results.put(currentWord, 0);
            }

            results.put(currentWord, results.get(currentWord) + 1);
            if(results.get(currentWord) > frequency) {
                frequency = results.get(currentWord);
            }
        }

        for (Map.Entry<String, Integer> word : results.entrySet()) {
            if(word.getValue() == frequency) {
                System.out.printf("%s -> %d times\n", word.getKey(), word.getValue());
            }
        }
    }
}
