package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters. Use .filter()
 */
public class p13_FilterArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String[] input=scan.nextLine().split(" ");

        List<String> output= Arrays.asList(input).stream().filter(s->s.length()>3).collect(Collectors.toList());

         for (int i = 0; i <output.size() ; i++) {
             System.out.printf("%s ",output.get(i));
        }
    }
}
