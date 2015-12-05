package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern textPattern=Pattern.compile("(\\b[A-Z]([a-z]+)*[A-Z]*([a-z]+)*[A-Z]\\b)");
        Matcher match = textPattern.matcher(text);

        while (match.find()){
            System.out.print(match.group(1)+" ");
        }
    }
}
