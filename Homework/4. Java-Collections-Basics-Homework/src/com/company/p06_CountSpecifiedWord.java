package com.company;

import java.util.Scanner;

/**
 * Write a program to find how many times a word appears in given text. The text is given at the first input line.
 * The target word is given at the second input line. The output is an integer number. Please ignore the character casing. Consider that any non-letter character is a word separator.
 */
public class p06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text=scan.nextLine().toLowerCase();
        String word=scan.next().toLowerCase();

        int index=0;
        int counter=0;
        while (true){
            int match=text.indexOf(word,index);
            if (match<0){
                break;
            }
            counter++;
            index=match+1;
        }

        System.out.println(counter);
    }
}
