package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[20];
        for(int i =0; i<20;i++){
            arr[i]=i+1;
        }
        for(int i =0;i<19;i++){
            for(int j =i;j<19;j++){
                if(arr[i]+arr[j]==n){
                    System.out.printf("%d + %d = %d",arr[i],arr[j],n);
                    System.out.println();
                    if(arr[i] != arr[j]) {
                        System.out.printf("%d + %d = %d", arr[j], arr[i], n);
                        System.out.println();
                    }
                }
            }
        }
        for(int i =19;i>=0;i--){
            for(int j =i;j>=0;j--){
                if(arr[i]-arr[j]==n){
                    System.out.printf("%d - %d = %d",arr[i],arr[j],n);
                    System.out.println();
                }
            }
        }
    }
}
