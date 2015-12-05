package Homework;
//Write a program that reads three floating point numbers from the console and
// calculates their result with the following formulae:
// ((a^2 + b^2) / (a^2 � b^2))^(a + b + c) / ?c   (a2 + b2 - c3)^(a � b)
// Then calculate the difference between the average of the three numbers and
// the average of the two formulae. Average (a, b, c) � Average (f1, f2)

import java.util.Scanner;

public class p04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double firstFormula = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));
        double secFormula = Math.pow((a * a + b * b - c * c * c), (a - b));
        double diff = ((a + b + c) / 3) - ((firstFormula + secFormula) / 2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormula, secFormula,Math.abs(diff));
    }
}
