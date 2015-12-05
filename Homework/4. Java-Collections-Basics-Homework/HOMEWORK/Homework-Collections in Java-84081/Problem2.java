package com.company;

import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\s");
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.print(s);
        for (int j = i + 1; j < str.length; j++) {
            String match = str[j];
            if (match.equals(s)) {
                System.out.print(" " + match);
                i++;
                }
            }
        System.out.println();
        }
    }
}
