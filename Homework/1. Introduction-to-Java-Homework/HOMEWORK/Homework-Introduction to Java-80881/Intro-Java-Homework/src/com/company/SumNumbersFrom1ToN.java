package com.company;

import java.util.Scanner;

public class SumNumbersFrom1ToN {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);

    }

}
