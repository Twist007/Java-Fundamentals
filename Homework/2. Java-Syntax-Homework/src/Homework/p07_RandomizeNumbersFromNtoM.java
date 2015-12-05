package Homework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

//Write a program that takes as input two integers N and M, and randomizes the numbers
// between them. Note that M may be smaller than or equal to N.
public class p07_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int max = Math.max(numA, numB);
        int min = Math.min(numA, numB);

        ArrayList randomized = new ArrayList<>();
        Random randomGen = new Random();
        int border = max - min + 1;
        for (int i = 0; i < border; i++) {
            int randomNum = randomGen.nextInt(border) + min;
            while (randomized.contains(randomNum)) {
                randomNum = randomGen.nextInt(border) + min;
            }
            randomized.add(randomNum);
        }

        System.out.println(randomized);

    }
}
