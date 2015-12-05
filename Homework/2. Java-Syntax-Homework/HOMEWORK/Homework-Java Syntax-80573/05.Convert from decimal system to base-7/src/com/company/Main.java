package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num10 = sc.nextInt();
        String num7 = Integer.toString(num10, 7);
        System.out.println(num7);
    }
}