package com.company;

import java.util.Scanner;

/**
 * Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
 */
public class p05_CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words=scan.nextLine().trim().split("[^A-z]+");
        System.out.println(words.length);
    }
}
