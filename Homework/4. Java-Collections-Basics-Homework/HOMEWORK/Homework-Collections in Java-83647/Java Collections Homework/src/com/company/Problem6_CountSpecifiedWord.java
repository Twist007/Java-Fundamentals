package com.company;
import java.util.Scanner;

public class Problem6_CountSpecifiedWord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("[^a-zA-Z]+");
        int count = 0;
        String word = scan.next();
        for (String s : arr) {
            if(s.toUpperCase().equals(word.toUpperCase()))
                count++;
        }
        System.out.println(count);
    }
}
