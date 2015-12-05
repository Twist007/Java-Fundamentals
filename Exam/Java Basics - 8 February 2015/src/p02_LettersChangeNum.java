import java.util.Scanner;

public class p02_LettersChangeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split("\\s+");

        double totalSum = 0;
        for (String token : tokens) {
            char firstLetter = token.charAt(0);
            char lastLetter = token.charAt(token.length() - 1);
            double number = Double.parseDouble(token.substring(1, token.length() - 1));

            if (Character.isUpperCase(firstLetter)) {
                number /= firstLetter - 'A' + 1;
            } else {
                number *= firstLetter - 'a' + 1;
            }

            if (Character.isUpperCase(lastLetter)) {
                number -= (lastLetter - 'A' + 1);
            } else {
                number += (lastLetter - 'a' + 1);
            }

            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }
}













