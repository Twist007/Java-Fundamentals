package Homework;

import java.util.Scanner;

//You are given an array of integers as a single line, separated by a space.
// Write a program that checks consecutive pairs and prints if both are odd/even or not.
// Note that the array length should also be an even number
public class p08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numbers.length % 2 == 1) {
            System.out.println("Invalid length\n");
            return;
        }

        String even = "both are even";
        String odd = "both are odd";
        String diff = "different";

        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> %s\n", numbers[i], numbers[i + 1], even);
            } else if (numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1) {
                System.out.printf("%d, %d -> %s\n", numbers[i], numbers[i + 1], odd);
            } else {
                System.out.printf("%d, %d -> %s\n", numbers[i], numbers[i + 1], diff);
            }
        }
    }
}
