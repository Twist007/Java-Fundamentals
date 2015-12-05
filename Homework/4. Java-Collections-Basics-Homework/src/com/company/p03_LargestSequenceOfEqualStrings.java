package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
 * If several sequences have the same longest length, print the leftmost of them. The input strings are given as a single line, separated by a space.
 */
public class p03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        ArrayList<String> output =new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            ArrayList<String> temp=new ArrayList<>();

            temp.add(arr[i]);

            while ((i < arr.length - 1) && (arr[i + 1].equals(arr[i]))) {
                temp.add(arr[i + 1]);
                i++;
            }
            if  (temp.size()>output.size()){
                output.clear();
                output.addAll(temp);
            }
        }
        if (arr.length==1){
            output.add(arr[0]);
        }

        System.out.println(output);
    }
}
