//Write a program that converts the decimal number
// system to the ghetto numeral system. In the ghetto, numbers are represented as following:
package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] ghettoNum = scan.next().toCharArray();
        for (int i = 0; i < ghettoNum.length; i++) {
            char letter= ghettoNum[i];
            switch (letter){
                case '0':
                    System.out.print("Gee");
                    break;
                case'1':
                    System.out.print("Bro");
                    break;
                case'2':
                    System.out.print("Zuz");
                    break;
                case'3':
                    System.out.print("Ma");
                    break;
                case'4':
                    System.out.print("Duh");
                    break;
                case'5':
                    System.out.print("Yo");
                    break;
                case'6':
                    System.out.print("Dis");
                    break;
                case'7':
                    System.out.print("Hood");
                    break;
                case'8':
                    System.out.print("Jam");
                    break;
                case'9':
                    System.out.print("Mack");
                    break;
            }
        }
    }
}