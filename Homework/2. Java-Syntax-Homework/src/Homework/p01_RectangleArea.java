//Write a program that enters the sides of a rectangle (two integers a and b) and calculates and
// prints the rectangle's area.
package Homework;

import java.util.Scanner;

public class p01_RectangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int area = sideA * sideB;

        System.out.println("Area = " + area);
    }
}
