package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Problem9_CombineListsOfLetters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split(" ");
        String[] secondLine = scan.nextLine().split(" ");

        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        for (String s : firstLine) {
            arr1.add(s.charAt(0));
        }
        for (String s : secondLine) {
            arr2.add(s.charAt(0));
        }

//        for (Character character : arr2) {
//            if(!arr1.contains(character))
//                result.add(character);
//        }
        final List<Character> finalResult = new ArrayList<>(arr1);
        arr2.stream().filter(chr -> !arr1.contains(chr)).forEach(finalResult::add);
        System.out.println(finalResult);

    }
}
