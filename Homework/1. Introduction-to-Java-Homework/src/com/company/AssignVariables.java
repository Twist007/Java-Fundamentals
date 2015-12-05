//Find suitable types for variables. You are given the following types: byte, short, int, long, char, boolean, float,
// double, and String. Assign the following values to them false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011,
// 0.5f, 919827112351L, 127, ‘c’. Try to assign 32768 to short and see what happens.
package com.company;

public class AssignVariables {

    public static void main(String[] args) {

        byte varByte = 127;
        short varShort = 32767;
        int varInteger = 2000000000;
        long varLong = 919827112351L;
        char varChar = 'c';
        boolean varBool = false;
        float varFloat = 0.5f;
        double varDouble = 0.1234567891011;
        String varString = "Palo Alto, CA";

       // short tryShort = 32768;

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInteger);
        System.out.println(varLong);
        System.out.println(varChar);
        System.out.println(varBool);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varString);
    }
}
