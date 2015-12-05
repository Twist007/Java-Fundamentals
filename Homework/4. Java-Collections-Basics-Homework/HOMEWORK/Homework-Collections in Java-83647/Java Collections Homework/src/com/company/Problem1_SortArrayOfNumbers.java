package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1_SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < number; i++)
            arr[i] = scan.nextInt();

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
