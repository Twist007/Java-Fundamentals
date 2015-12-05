package com.company;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(
                        new FileReader("res/lines.txt"))){
            String line;
            String result = "";
            while((line = br.readLine()) != null){
                result += line.toUpperCase();
                result += "\r\n";
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("res/linesUp.txt"))){
                bw.write(result);
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }

        } catch (IOException ex){
            System.out.println(ex.toString());
        }
    }
}
