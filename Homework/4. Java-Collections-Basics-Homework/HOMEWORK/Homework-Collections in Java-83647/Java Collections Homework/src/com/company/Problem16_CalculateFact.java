package com.company;

public class Problem16_CalculateFact {
    public static long calculateFact(int number){
        if(number == 0)
            return 1;
        return number * calculateFact(number - 1);
    }
    public static void main(String[] args){
        final int n = 15;
        System.out.println("Fact of " + n + " is " + calculateFact(n));
    }
}
