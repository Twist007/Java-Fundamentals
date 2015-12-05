import java.util.Scanner;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class LongestIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split("\\s+");
        int[] nums = new int[input.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int startIndex = 0;
        int longestSequence = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentIndex = i;
            int currentLongestSequence = 1;
            System.out.print(currentNum);

            for (int j = i + 1; j < nums.length; j++) {
                int subNum = nums[j];
                if (subNum > currentNum) {
                    System.out.print(" " + subNum);
                    currentNum = subNum;
                    currentLongestSequence++;
                    i++;
                } else {
                    break;
                }
            }

            if(currentLongestSequence > longestSequence) {
                longestSequence = currentLongestSequence;
                startIndex = currentIndex;
            }

            System.out.println();
        }

        System.out.print("Longest:");
        for (int i = startIndex; i < startIndex + longestSequence; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
