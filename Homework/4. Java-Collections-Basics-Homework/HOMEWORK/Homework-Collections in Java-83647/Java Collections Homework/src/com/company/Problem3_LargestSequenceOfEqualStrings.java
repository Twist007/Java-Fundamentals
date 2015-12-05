package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");

        ArrayList<String> longest = null;
        int longestCount = 0;

        for (int i = 0; i < arr.length; i++) {
            ArrayList<String> sequence = new ArrayList<>();
            sequence.add(arr[i]);

            for (int j = i + 1; j < arr.length; j++){
                if(arr[j].equals(sequence.get(0))){
                    sequence.add(arr[j]);
                    i++;
                }
            }
            if(sequence.size() > longestCount){
                longest = sequence;
                longestCount = sequence.size();
            }
        }
        System.out.println(longest);

    }
}
