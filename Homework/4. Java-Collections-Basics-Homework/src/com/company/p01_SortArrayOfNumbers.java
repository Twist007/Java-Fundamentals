package com.company;
/* Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[]. */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrLength = scan.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
