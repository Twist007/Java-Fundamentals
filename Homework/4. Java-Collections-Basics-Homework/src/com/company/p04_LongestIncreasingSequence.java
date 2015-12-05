package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Write a program to find all increasing sequences inside an array of integers. The integers are given in a single
 * line, separated by a space. Print the sequences in the order of their appearance in the input array, each at a
 * single line. Separate the sequence elements by a space. Find also the longest increasing sequence and print it at
 * the last line. If several sequences have the same longest length, print the leftmost of them.
 */
public class p04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.asList(scan.nextLine()
                .split(" "))
                .stream()
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());

        int count = 1;
        int end = 0;
        int temp = 1;

        System.out.print(num.get(0) + " ");

        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) > num.get(i - 1)) {
                System.out.print(num.get(i) + " ");
                temp++;
            } else {
                System.out.println();
                System.out.print(num.get(i) + "");
                temp = 1;
            }
            if (temp > count) {
                count = temp;
                end = i;
            }
        }

        System.out.println();
        System.out.print("Longest: ");
        int start = end - count + 1;
        for (int i = start; i <= end; i++) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println();
    }
}
