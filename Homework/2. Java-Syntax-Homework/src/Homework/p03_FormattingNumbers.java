package Homework;
//Write a program that reads 3 numbers: an integer a (0 ? a ? 500), a floating-point b
// and a floating-point c and prints them in 4 virtual columns on the console. Each
// column should have a width of 10 characters. The number a should be printed in
// hexadecimal, left aligned; then the number a should be printed in binary form,
// padded with zeroes, then the number b should be printed with 2 digits after
// the decimal point, right aligned; the number c should be printed with 3
// digits after the decimal point, left aligned.

import java.util.Scanner;

public class p03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        boolean isInRange = numA >= 0 && numA <= 500;
        if (!isInRange) {
            System.out.println("Enter number in range 0-500");
            while (!isInRange) {
                numA = scan.nextInt();
                isInRange = numA >= 0 && numA <= 500;
            }
        }
        double numB = scan.nextDouble();
        double numC = scan.nextDouble();
        String binary = Integer.toBinaryString(numA);

        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", numA, String.format("%10s", binary).replace(' ', '0'), numB, numC);


    }
}
