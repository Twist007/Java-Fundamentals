//Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space.
// Use a for-loop. Note: you can directly declare and increment char in the for-loop. for
// (char c = ‘a’; …)
package com.company;

public class PrintCharacters {
   public static void main(String[] args){
       for (char ch = 'a'; ch < 'z'; ch++){
           System.out.print(ch+" ");
       }
   }


}
