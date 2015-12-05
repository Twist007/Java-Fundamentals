package com.company;

import java.util.Scanner;

/**
 * Write a program that recursively calculates factorial.
 */
public class p16_CalculateNfak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        System.out.println(factorial(number));

    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num*factorial(num-1);
    }
}
