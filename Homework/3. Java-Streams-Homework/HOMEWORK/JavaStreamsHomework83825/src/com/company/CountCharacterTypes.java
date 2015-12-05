package com.company;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("res/words.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("res/count-chars.txt"))){

            String line;
            int vowels = 0;
            int consonants = 0;
            int punctuations = 0;
            while((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    switch (line.charAt(i)){
                        case ' ':
                            break;
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowels++;
                            break;
                        case '!':
                        case ',':
                        case '.':
                        case '?':
                            punctuations++;
                            break;
                        default:
                            consonants++;
                            break;
                    }
                }
            }

            bw.write("Vowels: " + vowels);
            bw.newLine();
            bw.write("Consonants: " + consonants);
            bw.newLine();
            bw.write("Punctuations: " + punctuations);
            bw.newLine();

        }catch (IOException ex){
            System.out.println(ex.toString());
        }
    }
}
