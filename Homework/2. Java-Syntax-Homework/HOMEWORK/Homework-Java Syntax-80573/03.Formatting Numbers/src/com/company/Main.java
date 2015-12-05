package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a<0||a>500){
            System.out.println("Enter new value for a");
            a=sc.nextInt();
        }
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",Integer.toString(a, 16),Integer.parseInt(Integer.toString(a, 2)),b,c );


    }
}
