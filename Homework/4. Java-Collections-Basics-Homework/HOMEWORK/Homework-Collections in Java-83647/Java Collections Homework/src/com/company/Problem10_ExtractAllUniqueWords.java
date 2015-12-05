package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem10_ExtractAllUniqueWords {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split("[^a-zA-Z]+");

        TreeSet<String> words = new TreeSet<>();

        for (String str : input) {
            words.add(str.toLowerCase());
        }

        System.out.println(words);

    }
}
