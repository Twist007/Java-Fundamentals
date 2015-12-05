//Create a triangle of characters, based on input. Learn about java.util.Scanner and
// Integer.parseInt (). Test your program with integers up to 26. Think why
package com.company;

import java.util.Scanner;

public class PrintCharacterTriangle {
    public static  void  main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        char letter='a';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print((char)(letter+j) + " ");
            }
            System.out.println();
        }

        for (int i = num-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(letter+j) + " ");
            }
            System.out.println();
        }
    } 
}
