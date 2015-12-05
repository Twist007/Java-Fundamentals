package Homework;

import java.util.Scanner;

//Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of
// the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form a
// triangle, print "0" as result.

public class p02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int xA = scan.nextInt();
        int yA = scan.nextInt();

        int xB = scan.nextInt();
        int yB = scan.nextInt();

        int xC = scan.nextInt();
        int yC = scan.nextInt();

        int area = (xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2;
        int absArea = Math.abs(area);

        System.out.println("Area of triangle = " + absArea);

    }
}
