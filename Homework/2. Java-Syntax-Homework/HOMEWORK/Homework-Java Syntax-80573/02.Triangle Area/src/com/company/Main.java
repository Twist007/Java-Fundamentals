package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        String[] strArrA = sc.nextLine().split(" ");
        int xA = Integer.parseInt(strArrA[0]);
        int yA = Integer.parseInt(strArrA[1]);

        String[] strArrB = sc.nextLine().split(" ");
        int xB = Integer.parseInt(strArrB[0]);
        int yB = Integer.parseInt(strArrB[1]);

        String[] strArrC = sc.nextLine().split(" ");
        int xC = Integer.parseInt(strArrC[0]);
        int yC = Integer.parseInt(strArrC[1]);

        result = Math.abs((xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2);
        System.out.printf("%d",result);
    }
}
