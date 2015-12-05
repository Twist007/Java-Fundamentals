package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String[] command = sc.nextLine().split(" ");
        int n = Integer.parseInt(command[1]);

        int[] arr = new int[input.length];

        for(int i =0; i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        switch(command[2]){
            case "odd":GetNodd(arr,n);break;
            case "even": GetNeven(arr,n);break;
        }

    }
    public static void GetNodd(int[] arr, int n){
        int counter=0;
        for(int i =0; i<arr.length;i++){
            if (arr[i]%2!=0&&counter<n){
                System.out.print(arr[i]+" ");
                counter++;
            }
        }
    }
    public static void GetNeven(int[] arr, int n){
        int counter=0;
        for(int i =0; i<arr.length;i++){
            if (arr[i]%2 == 0&&counter<n){
                System.out.print(arr[i]+" ");
                counter++;
            }
        }
    }
}
