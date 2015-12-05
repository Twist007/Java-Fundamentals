package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] data = input.split(" ");
        int result = 0;
        int length0 = data[0].length();
        int length1 = data[1].length();
        if (length0 > length1) {
            for (int i = 0; i < length0; i++) {
                if (i < length1) {
                    result += (int) data[0].charAt(i) * (int) data[1].charAt(i);
                } else {
                    result += (int) data[0].charAt(i);
                }
            }
        } else {
            for (int i = 0; i < length1; i++) {
                if (i < length0) {
                    result += (int) data[0].charAt(i) * (int) data[1].charAt(i);
                } else {
                    result += (int) data[1].charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
