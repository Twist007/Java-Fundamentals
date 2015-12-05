package Homework;
//Write a program that takes an integer number and converts it to base-7

import java.util.Scanner;

public class p05_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String base7 = Integer.toString(num, 7);
        System.out.printf("%s", base7);
    }
}
