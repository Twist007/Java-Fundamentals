package com.itenev;

import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        StringBuilder input = new StringBuilder();

        input.append(console.nextLine()).reverse();

        long n = Long.parseLong(input.toString());

        long number;
        StringBuilder sb = new StringBuilder();

        do {
            number = n % 10;
            n = n / 10;
            switch ((byte) number) {
                case 0:
                    sb.append("Gee");
                    break;
                case 1:
                    sb.append("Bro");
                    break;
                case 2:
                    sb.append("Zuz");
                    break;
                case 3:
                    sb.append("Ma");
                    break;
                case 4:
                    sb.append("Duh");
                    break;
                case 5:
                    sb.append("Yo");
                    break;
                case 6:
                    sb.append("Dis");
                    break;
                case 7:
                    sb.append("Hood");
                    break;
                case 8:
                    sb.append("Jam");
                    break;
                case 9:
                    sb.append("Mack");
                    break;
            }
        } while (n >= 1);

        System.out.println(sb.toString());
    }
}
