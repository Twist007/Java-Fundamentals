package Homework;

import java.util.Scanner;

//Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
// (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two
// characters. If one of the strings is longer than the other, add the remaining character codes to the total
// sum without multiplication.
public class p12_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1=scan.next();
        String str2=scan.next();
        System.out.println(sumOfCharacter(str1, str2));
    }

    private static int sumOfCharacter(String str1, String str2) {
        int longStr = Math.max(str1.length(), str2.length());

        int sum = 0;
        for (int i = 0; i < longStr; i++) {
            int char1 = 1;
            int char2 = 1;

            if (i < str1.length()) {
                char1 = str1.charAt(i);
            }
            if (i < str2.length()) {
                char2 = str2.charAt(i);
            }
            sum += char1 * char2;
        }
        return sum;
    }
}
