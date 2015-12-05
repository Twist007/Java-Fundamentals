package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input = sc.nextLine();
        String[] array = input.split(" ");
        int[] arr = new int[array.length];
        for(int i = 0; i<array.length; i++){
            arr[i]=Integer.parseInt(array[i]);
        }
        if(arr.length%2==0) {
            for (int i = 0; i < arr.length - 1; i+=2) {
                if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", arr[i], arr[i + 1]);
                    System.out.println();
                } else if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd", arr[i], arr[i + 1]);
                    System.out.println();
                } else {
                    System.out.printf("%d, %d -> different", arr[i], arr[i + 1]);
                    System.out.println();
                }
            }
        }else{
            System.out.println("Invalid length");
        }
    }
}
