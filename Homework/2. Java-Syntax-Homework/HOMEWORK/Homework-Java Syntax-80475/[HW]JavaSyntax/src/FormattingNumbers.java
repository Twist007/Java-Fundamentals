import java.io.PrintStream;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = Integer.parseInt(input.nextLine());
        double secondNum = Double.parseDouble(input.nextLine());
        double thirdNum = Double.parseDouble(input.nextLine());

        String firstNumHexadecimal=Integer.toHexString(firstNum).toUpperCase();
        String firstNumBinary =String.format("%-10s",Integer.toBinaryString(firstNum)).replace(' ', '0');
        PrintStream printf = System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", firstNumHexadecimal,firstNumBinary,secondNum,thirdNum);
    }
}
