import java.util.Arrays;
import java.util.Scanner;

public class p03_WeirdStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        line = line.replaceAll("([\\\\\\/\\|\\(\\)\\s]+)", "");
        String[] allWords = line.split("[^a-zA-Z]+");

        int bestWeight = Integer.MIN_VALUE;
        String bestWords = "";

        for (int i = 0; i < allWords.length-1; i++) {
            int firstWordWeight = getWeight(allWords[i]);
            int secondWordsWeight = getWeight(allWords[i + 1]);

            int currentCoupleSum = firstWordWeight + secondWordsWeight;
            if (currentCoupleSum >= bestWeight) {
                bestWeight = currentCoupleSum;
                bestWords = allWords[i] + "\n" + allWords[i + 1];
            }
        }
        System.out.println(bestWords);
    }

    private static int getWeight(String str) {
        str = str.toLowerCase();
        int totalWeight = 0;
        for (int i = 0; i < str.length(); i++) {
            int currentWeight = str.charAt(i) - 'a' + 1;
            totalWeight += currentWeight;
        }
        return totalWeight;
    }
}


