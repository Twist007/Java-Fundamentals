package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class Problem13_FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        List<String> result = Arrays.asList(input).stream().filter(str -> str.length() > 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
