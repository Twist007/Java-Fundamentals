import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[]number = input.nextLine().toCharArray();
        int powerCounter=number.length-1;
        int toDecimalNum = 0;
        for (int i = 0; i <number.length ; i++) {
            toDecimalNum += Character.getNumericValue(number[i])* Math.pow(7,powerCounter);
            powerCounter--;
        }
        System.out.println(toDecimalNum);
    }
}
