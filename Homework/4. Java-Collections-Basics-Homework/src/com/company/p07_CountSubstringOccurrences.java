package com.company;

import java.util.Scanner;

/**
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line. The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 */
public class p07_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();
        String word = scan.next().toLowerCase();

        int count = 0;

        for (int i = 0; i < text.length() - word.length()+1; i++) {
            String textSubstr=text.substring(i,i+word.length());
            if (textSubstr.equals(word)){
                count++;
            }
        }

        System.out.println(count);
    }
}
