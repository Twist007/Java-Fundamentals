package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String args[]){
        String[] numberPrefix = new String[]{"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack",};
        Scanner console = new Scanner(System.in);
        String input = (console.nextLine());
        for (int i = 0; i < input.length(); i++) {
            System.out.print(numberPrefix[Character.digit(input.charAt(i), 10)]);
        }
    }
}