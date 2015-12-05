package com.company;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * At the first line at the console you are given a piece of text. Extract all words from it and print
 * them in alphabetical order. Consider each non-letter character as word separator. Take the repeating
 * words only once. Ignore the character casing. Print the result words in a single line, separated by spaces.
 */
public class p10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();

        Pattern pattern=Pattern.compile("[A-z]+");
        Matcher matcher=pattern.matcher(text);

        TreeSet<String> output=new TreeSet<>();
        while (matcher.find()){
            output.add(matcher.group());
        }

        for (String out: output){
            System.out.print(out+" ");
        }
    }
}
