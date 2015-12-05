package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern textPattern = Pattern.compile("([a-z,A-z]+)");
        Matcher match = textPattern.matcher(input);

        while (match.find()){
            System.out.print(match.group(1)+" ");
        }
    }
}
