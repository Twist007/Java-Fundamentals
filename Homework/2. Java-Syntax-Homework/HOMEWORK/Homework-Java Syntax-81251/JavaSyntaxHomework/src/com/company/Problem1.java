package com.company;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int area = a * b;
        System.out.format("area = %d", area);
    }
}
