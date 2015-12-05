package com.itenev;

import java.util.Scanner;

public class SumNumbersFrom1toN {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        long n = Long.parseLong(console.nextLine());
        long sum = 0L;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

}
