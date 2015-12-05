package com.company;

import java.util.Scanner;

public class Problem7_CountSubstringOccurences {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String substring = scan.next();

        int count = 0;
        for (int i = 0; i <= text.length() - substring.length(); i++){
                if(text.substring(i, i + substring.length()).toUpperCase().equals(substring.toUpperCase()))
                    count++;

        }
        System.out.println(count);
    }
}
