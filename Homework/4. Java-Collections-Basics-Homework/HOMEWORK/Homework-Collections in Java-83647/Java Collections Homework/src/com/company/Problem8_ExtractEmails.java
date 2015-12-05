package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8_ExtractEmails {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("(?<![._-])\\b[a-zA-Z0-9]+(?:[._-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:-[a-zA-Z0-9]+)*(?:\\.[a-zA-Z0-9]+)+\\b");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
