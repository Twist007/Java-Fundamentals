package Homework;

import java.util.Scanner;

//Write a program that converts from a base-7 number to its decimal representation
public class p06_ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String base7 = scan.next();
        int decimalNum = Integer.parseInt(base7, 7);

        System.out.println(decimalNum);
    }
}
