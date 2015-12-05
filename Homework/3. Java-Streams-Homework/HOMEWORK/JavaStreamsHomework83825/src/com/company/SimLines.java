package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimLines {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("res/lines.txt"))){
            String i;
            int sum = 0;
            while((i = br.readLine()) != null){
                for (int j = 0; j < i.length(); j++) {
                    sum += i.charAt(j);
                }
                System.out.println(sum);
                sum = 0;
            }
        } catch (IOException ex){
            System.out.println(ex.toString());
        }
    }
}
