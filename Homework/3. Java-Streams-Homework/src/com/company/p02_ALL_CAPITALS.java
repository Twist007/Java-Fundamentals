package com.company;

import java.io.*;
import java.nio.Buffer;

/*
Write a program that reads a text file and changes the casing of all letters to upper.
The file should be overwritten. Use BufferedReader, FileReader, FileWriter, and PrintWriter.
*/
public class p02_ALL_CAPITALS {
    public static void main(String[] args) {
        try (
                BufferedReader bfr = new BufferedReader(
                        new FileReader("resources/lines.txt"));
                BufferedWriter bfw = new BufferedWriter(
                        new FileWriter("resources/lines-upper.txt"));
        ) {

            String line;
            while ((line = bfr.readLine()) != null) {
                String upper = line.toUpperCase();
                bfw.write(upper);
                bfw.newLine();
            }

        } catch (java.io.IOException e) {
            System.out.println("File not found!");
        }
    }
}
