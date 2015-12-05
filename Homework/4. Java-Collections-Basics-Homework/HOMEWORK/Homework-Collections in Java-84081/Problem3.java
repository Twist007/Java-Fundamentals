package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\s");
        HashMap <String,Integer> map = new HashMap<>();
        for(int i=0; i < str.length; i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }else{
                map.put(str[i],1);
            }
        }
        int sequence = 0;
        String s = "";
        for ( Map.Entry <String,Integer> entry:map.entrySet()){
            if (entry.getValue() > sequence){
                sequence = entry.getValue();
                s = entry.getKey();
            }
        }
        for(int i = 0; i < sequence; i++){
            System.out.print(s + " ");
        }
    }
}
