package com.company;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(
                new FileReader(
                        "D:\\Java\\lines.txt"));
        String fullText = "";
        String tempStr;

        while ((tempStr = bfr.readLine()) != null) {
            fullText += tempStr.toUpperCase() + "\r\n";
        }

        PrintWriter prw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(
                                "D:\\Java\\lines.txt")));
        prw.write(fullText);
        prw.flush();
        bfr.close();
        prw.close();


    }

}
