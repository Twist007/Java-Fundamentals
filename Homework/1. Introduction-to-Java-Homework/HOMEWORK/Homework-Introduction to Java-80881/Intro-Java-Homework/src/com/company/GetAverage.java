
package com.company;

import java.util.Scanner;

public class GetAverage {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);

        float numberA = Float.parseFloat(console.nextLine());
        float numberB = Float.parseFloat(console.nextLine());
        float numberC = Float.parseFloat(console.nextLine());

        float average = Average(numberA, numberB, numberC);
        System.out.format("%.2f", average);
    }
    public static float Average(float numberA, float numberB, float numberC){
        float result = (numberA+numberB+numberC)/3;
        return result;
    }
}