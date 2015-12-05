package Homework;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program that extracts words from a string. Words are sequences of characters
// that are at least two symbols long and consist only of English alphabet letters.
// Use regex.
public class p10_ExtractWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input=scan.nextLine();
        Pattern regex=Pattern.compile("[A-z]+");
        Matcher matcher=regex.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
