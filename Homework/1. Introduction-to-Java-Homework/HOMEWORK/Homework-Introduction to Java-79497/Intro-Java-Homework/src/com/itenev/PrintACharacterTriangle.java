package com.itenev;

import java.util.Scanner;

/**
 * Created by root on 10/13/2015.
 */
public class PrintACharacterTriangle {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print((char) (j + 97));
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print((char) (j + 97));
            }
            System.out.println();
        }

    }
}