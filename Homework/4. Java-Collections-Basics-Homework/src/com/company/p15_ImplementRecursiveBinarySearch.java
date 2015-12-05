package com.company;

import java.util.Scanner;

/**
 * Binary search is an algorithm that works on already sorted arrays. Basically, it goes to the middle element and checks
 * it has to continue searching to the left, or to the right. Return the index of the element, or -1, if the element
 * is not found.
 */
public class p15_ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println(binarySearch(numbers, 0, numbers.length - 1, num));

    }

    public static int binarySearch(int[] arr, int startIndex, int endIndex, int x) {
        int middleIndex = (startIndex + endIndex) / 2;
        int midElem = arr[middleIndex];

        if (x == midElem) {
            return middleIndex;
        }
        if (endIndex - startIndex == 0) {
            return -1;
        }
        if (x < middleIndex) {
            return binarySearch(arr, startIndex, middleIndex, x);
        } else {
            return binarySearch(arr, middleIndex + 1, endIndex, x);
        }
    }
}
