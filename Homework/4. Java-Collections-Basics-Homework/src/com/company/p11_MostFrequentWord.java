package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a program to find the most frequent word in a text and print it, as well as how many times it appears in
 * format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing.
 * If several words have the same maximal frequency, print all of them in alphabetical order.
 */
public class p11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().toLowerCase().split("[\\W]+");

        HashMap<String, Integer> wordsFrequency = new HashMap<>();
        int frequency = 0;

        for (String word : text) {

            if (!wordsFrequency.containsKey(word)) {
                wordsFrequency.put(word, 0);
            }

            wordsFrequency.put(word, wordsFrequency.get(word) + 1);
            if (wordsFrequency.get(word) > frequency) {
                frequency = wordsFrequency.get(word);
            }
        }

        for (Map.Entry<String, Integer> word : wordsFrequency.entrySet()) {
            if (word.getValue() == frequency) {
                System.out.printf("%s -> %d times\n", word.getKey(), word.getValue());
            }
        }
    }
}
