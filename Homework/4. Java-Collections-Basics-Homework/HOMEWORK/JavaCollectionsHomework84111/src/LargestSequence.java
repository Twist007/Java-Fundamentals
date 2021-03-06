import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class LargestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().trim().split("\\s");

        int startIndex = 0;
        int longestSequence = 1;

        for (int i = 0; i < strArr.length; i++) {
            String currentStr = strArr[i];
            int currLongestSequence = 1;
            int currStartIndex = i;
            for (int j = i + 1; j < strArr.length; j++) {
                String compareStr = strArr[j];
                if (compareStr.equals(currentStr)) {
                    currLongestSequence++;
                    i++;
                } else {
                    break;
                }
            }

            if (currLongestSequence > longestSequence) {
                longestSequence = currLongestSequence;
                startIndex = currStartIndex;
            }
        }

        System.out.printf("The longest sequence of equal strings is: %s", strArr[startIndex]);
        for (int i = startIndex + 1; i < startIndex + longestSequence; i++) {
            System.out.print(" " + strArr[i]);
        }
    }
}
