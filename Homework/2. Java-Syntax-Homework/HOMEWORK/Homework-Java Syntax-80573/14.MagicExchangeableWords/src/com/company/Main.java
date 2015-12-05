package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ") ;
        boolean result=false;

        for (int i =0;i<str[0].length()-1;i++){
            for (int j =i+1;j<str[0].length();j++) {
                if (str[0].charAt(i) == str[0].charAt(j)&&str[1].charAt(i) == str[1].charAt(j)){
                    result=true;
                }else if (str[0].charAt(i) != str[0].charAt(j)&&str[1].charAt(i) != str[1].charAt(j)){
                    result=true;
                }else{
                    result=false;
                    System.out.println(result);
                    return;
                }
            }
        }
        System.out.println(result);
    }
}
