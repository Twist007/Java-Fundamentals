package Homework;

import java.util.Scanner;

//Write a program that takes as input an integer – the target – and outputs to
// the console all pairs of numbers between 1 and 20, which, if added or subtracted,
// result in the target.
public class p09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target=scan.nextInt();
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (i+j==target){
                    System.out.printf("%d + %d = %d\n",i ,j, target);
                } else if (i-j==target){
                    System.out.printf("%d - %d = %d\n",i ,j, target);
                }
            }
        }
    }
}
