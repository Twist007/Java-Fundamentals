package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Write a program that reads a text file and prints on the console the sum of the ASCII symbols
of each of its lines. Use BufferedReader in combination with FileReader.
*/
public class p01_SumLines {

    public static void main(String[] args) {

        try (
                BufferedReader fileReader = new BufferedReader(
                        new FileReader("resources/lines.txt"));
        ) {
            while (true) {
                String line = fileReader.readLine();
                if (line == null) {
                    break;
                }
                int sum = 0;
                char[] arrLine = line.toCharArray();
                for (int i = 0; i < arrLine.length; i++) {
                    sum += arrLine[i];
                }
                System.out.println(sum);
            }
            // catch exception if file is not found.
        } catch (java.io.IOException e) {
            System.out.println("File not found!");
        }

    }
}
