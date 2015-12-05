package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Victor on 10/25/2015.
 */
public class Problem14_SortArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<Integer> input = Arrays.asList(console.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        String command = console.next();

        List<Integer> result;
        if(command.equals("Ascending"))
            result = input.stream().sorted().collect(Collectors.toList());
        else
            result = input.stream().sorted((i,j) -> j - i).collect(Collectors.toList());

        System.out.println(result);
    }
}
