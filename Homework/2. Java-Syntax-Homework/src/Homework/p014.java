package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p014 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Map comb = new HashMap<>();
        String[] words=scan.nextLine().split(" ");
        String fWord=words[0];
        String secWord=words[1];
        boolean exchangeble=true;

        for (int i = 0; i < fWord.length(); i++) {
            if (!comb.containsKey(fWord.charAt(i))) {
                comb.put(fWord.charAt(i), secWord.charAt(i));
            } else if ((comb.get(fWord.charAt(i)) != secWord.charAt(i))) {
                exchangeble = false;
                break;
            }
        }
        System.out.println(exchangeble);
    }
}
