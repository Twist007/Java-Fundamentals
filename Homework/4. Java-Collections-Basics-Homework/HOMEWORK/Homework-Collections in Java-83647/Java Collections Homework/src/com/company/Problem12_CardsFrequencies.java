package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem12_CardsFrequencies {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("[ ????]+");
        LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();

        for (String str : input) {
            String card = str;
            if(!cards.containsKey(card)){
                cards.put(card, 1);
            }
            else
                cards.put(card, cards.get(card) + 1);
        }
        int size = input.length;
        for (Map.Entry<String, Integer> entry : cards.entrySet()) {
            System.out.printf("%s -> %.2f%% \n", entry.getKey(), (double)entry.getValue() / size * 100);
        }

    }
}
