package com.company;
/* Write a program that reads a list of words from the file words.txt and finds the count of vowels
 (?????? ?????), consonants (????????) and other punctuation marks. Since English is a bit tricky,
 assume that a, e, i, o, u are vowels and all others are consonants. Punctuation marks are (!,.?).
  Do not count whitespace. Write the results in file count-chars.txt.
*/

import java.io.*;

public class p03_CountCharacterTypes {
    public static void main(String[] args) {

        String vowelsSym = "aeuio";
        String punctuationSym = "!.,?";
        int consonants = 0;
        int vowels = 0;
        int punctuation = 0;

        try (
                BufferedReader bfr = new BufferedReader(
                        new FileReader("resources/words.txt"));
                BufferedWriter bfw = new BufferedWriter(
                        new FileWriter("resources/count-chars.txt"));
        ) {

            int symbol;
            while ((symbol = bfr.read()) != -1) {
                char ch = (char) symbol;
                if (vowelsSym.contains(ch + "")) {
                    vowels++;
                } else if (punctuationSym.contains(ch + "")) {
                    punctuation++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            bfw.write("Vowels: " + vowels + "\nConsonants: " + consonants + "\nPunctuation: " + punctuation + "\n");

        } catch (java.io.IOException e) {
            System.out.println("File not found!");
        }
    }
}

