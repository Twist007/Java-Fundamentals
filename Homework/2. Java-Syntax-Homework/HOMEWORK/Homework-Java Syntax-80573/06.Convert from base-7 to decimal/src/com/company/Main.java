package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        ChangeNumSystem(number,base1,base2);
    }
    public  static void ChangeNumSystem(String number, int base1, int base2 ){
        System.out.println(Integer.toString(Integer.parseInt(number, base1), base2));
    }
}
