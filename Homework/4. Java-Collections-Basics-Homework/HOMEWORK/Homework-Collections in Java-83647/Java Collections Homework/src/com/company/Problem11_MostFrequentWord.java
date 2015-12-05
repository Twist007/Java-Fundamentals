package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem11_MostFrequentWord {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("[^a-zA-Z]+");

        TreeMap<String, Integer> words = new TreeMap<>();

        for (String str : input) {
            String lowerCase = str.toLowerCase();
            if(words.containsKey(lowerCase)){
                words.put(lowerCase, words.get(lowerCase) + 1);
            }
            else{
                words.put(lowerCase, 1);
            }
        }
        int count = 1;
        for (Integer integer : words.values()) {
            if(integer > count)
                count = integer;
        }
        final int mostFrequencies = count;
        words.entrySet().stream().filter(entry -> entry.getValue() == mostFrequencies).forEach(entry -> System.out.printf("%s -> %d times\n", entry.getKey(), entry.getValue()));
    }
}
