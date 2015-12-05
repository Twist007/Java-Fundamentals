package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4_LongestIncreasingSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        ArrayList<Integer> longest = null;
        int longestCount = 0;

        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> sequence = new ArrayList<>();
            sequence.add(arr[i]);

            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] > sequence.get(sequence.size() - 1)){
                    sequence.add(arr[j]);
                    i++;
                }
                else break;
            }
            if(sequence.size() > longestCount){
                longest = sequence;
                longestCount = sequence.size();
            }
            System.out.println(sequence);
        }
        System.out.println("Longest: " + longest);
    }
}
