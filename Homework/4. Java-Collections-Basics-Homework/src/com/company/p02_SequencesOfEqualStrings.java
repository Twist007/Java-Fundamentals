package com.company;

import java.util.Scanner;

/**
 * Write a program that enters an array of strings and finds in it all sequences of
 * equal elements. The input strings are given as a single line, separated by a space.
 */
public class p02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrayOfWords = scan.nextLine().split(" ");

        for (int i = 1; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i - 1].equals(arrayOfWords[i])) {
                System.out.print(arrayOfWords[i - 1] + " ");
            } else {
                System.out.println(arrayOfWords[i - 1]);
            }
        }
        System.out.println(arrayOfWords[arrayOfWords.length - 1]);
    }
}
