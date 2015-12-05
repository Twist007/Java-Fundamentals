package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c
 * from l2 to the end of l1, but only when c does not appear in l1. Print the obtained combined list.
 * All lists are given as sequence of letters separated by a single space, each at a separate line.
 * Use ArrayList<Character> of chars to keep the input and output lists
 */
public class p09_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Character> l1 = new ArrayList(Arrays.asList(scan.nextLine().split(" ")));
        ArrayList<Character> l2 = new ArrayList(Arrays.asList(scan.nextLine().split(" ")));

        for (int i = 0; i < l2.size(); i++) {
            if (!l1.contains(l2.get(i))){
                l1.add(l2.get(i));
            }
        }
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+ " ");
        }

    }
}
