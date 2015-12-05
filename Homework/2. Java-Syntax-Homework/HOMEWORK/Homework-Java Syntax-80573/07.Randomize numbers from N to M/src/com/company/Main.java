package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m<n){
            int temp;
            temp=n;
            n=m;
            m=temp;
        }
        List<Integer> num = new ArrayList();
        for(int i =0;i<=m-n;i++){
            num.add(n+i);
        }

        int[] result = new int[m-n+1];
        Random rand = new Random();

        for(int i=0;i<=m-n;i++){
            int  rnd = rand.nextInt(num.size()) + 0;
            result[i]=num.get(rnd);
            num.remove(rnd);
        }
        for (int value:result){
            System.out.printf("%d ",value);
        }
    }
}
