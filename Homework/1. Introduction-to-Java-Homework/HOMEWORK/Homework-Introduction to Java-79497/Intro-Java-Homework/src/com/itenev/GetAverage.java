package com.itenev;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        float a = Float.parseFloat(console.nextLine());
        float b = Float.parseFloat(console.nextLine());
        float c = Float.parseFloat(console.nextLine());

        System.out.println(String.format("%.2f", getAvg(a, b, c)));

    }

    public static float getAvg(float a, float b, float c) {

        return (a + b + c) / 3;
    }
}
