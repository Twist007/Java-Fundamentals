package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
public class p13_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split(" ");
        String[] command = scan.nextLine().split(" ");

        oddOrEvenNum(numbers, command);
    }

    private static void oddOrEvenNum(String[] numbers, String[] command) {

        int[] num = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        evenOrOdd(command[1], command[2], num);
    }

    private static void evenOrOdd(String count, String command, int[] num) {

        List<Integer> outputOdd = new ArrayList<Integer>();
        List<Integer> outputEven = new ArrayList<Integer>();
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 && countOdd < Integer.parseInt(count)) {
                outputEven.add(num[i]);
                countOdd++;
            }
            if (num[i] % 2 != 0 && countEven < Integer.parseInt(count)) {
                outputOdd.add(num[i]);
                countEven++;
            }
        }

        switch (command) {
            case "odd":
                System.out.println(outputOdd);
                break;
            case "even":
                System.out.println(outputEven);
                break;
        }
    }

}
