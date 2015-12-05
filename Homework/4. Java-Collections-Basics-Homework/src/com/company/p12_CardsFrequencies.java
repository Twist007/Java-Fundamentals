package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit),
 * separated by a space. Write a program to calculate and print at the console the frequency of each card face in
 * format "card_face -> frequency". The frequency is calculated by the formula appearances / N and is expressed
 * in percentages with exactly 2 digits after the decimal point. The card faces with their frequency should be
 * printed in the order of the card face's first appearance in the input. The same card can appear multiple times
 * in the input, but it's face should be listed only once in the output.
 */
public class p12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("[ ????]+");

        LinkedHashMap<String, Integer> cardsFrequency = new LinkedHashMap<>();

        for (String card : input) {

            if (!cardsFrequency.containsKey(card)) {
                cardsFrequency.put(card, 0);
            }

            cardsFrequency.put(card, cardsFrequency.get(card) + 1);
        }

        for (Map.Entry<String, Integer> card : cardsFrequency.entrySet()) {
            System.out.printf("%s -> %.2f%%\n", card.getKey(), (double)card.getValue()/input.length*100);
        }

    }
}
