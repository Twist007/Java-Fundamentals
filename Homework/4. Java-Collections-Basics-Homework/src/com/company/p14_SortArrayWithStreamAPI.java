package com.company;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Use the .sorted() method to sort an array of integers. The first line of input is the array. The second is the sorting order.
 */
public class p14_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.asList(scan.nextLine().split(" "))
                .stream()
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
        String command = scan.next();

        List<Integer> result = num.stream().sorted().collect(Collectors.toList());
        if (command == "Ascending") {
            System.out.println(result);
        } else {
            result=result.stream().sorted((i,j)->j-i).collect(Collectors.toList());
            System.out.println(result);

        }
    }
}
