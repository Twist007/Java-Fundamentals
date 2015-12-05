//Create a method that finds the average of three numbers. Read in internet about
// java methods. Check the naming conventions. Invoke your method and test it. Format
// the output to two digits after the decimal separator. The placeholder is %.2f
package com.company;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNumber =scan.nextDouble();
        double secondNumber = scan.nextDouble();
        double thirdNumber = scan.nextDouble();


        averageOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

    }
    private static void averageOfThreeNumbers(double firstNum, double secNum, double thrNum) {
        double sum = firstNum + secNum + thrNum;
        double average=sum/3;
        System.out.printf("%.2f ", average);

    }
}
