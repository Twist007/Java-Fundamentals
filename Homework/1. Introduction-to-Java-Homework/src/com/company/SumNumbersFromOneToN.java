//Create a Java program that reads a number N from the console and calculates
// the sum of all numbers from 1 to N (inclusive).
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbersFromOneToN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int inputNumber=scan.nextInt();
        int sum =0;
        for (int i = 1; i <= inputNumber; i++) {
           System.out.print(i);
            if (i < inputNumber) {
                System.out.print(" + ");
            }
            sum+=i;
        }
    System.out.println(" = "+sum);
    }
}
