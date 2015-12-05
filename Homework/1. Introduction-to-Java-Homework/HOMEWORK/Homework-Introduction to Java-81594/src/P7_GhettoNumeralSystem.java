import java.util.Scanner;

public class P7_GhettoNumeralSystem {
    public static void main (String[] args) {
        String[] ghettoN = new String [] {
                "Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};
        System.out.println("Enter a number to convert to the ghetto numeral system, please: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);
            switch (d) {
                case '0': System.out.print(ghettoN[0]); break;
                case '1': System.out.print(ghettoN[1]); break;
                case '2': System.out.print(ghettoN[2]); break;
                case '3': System.out.print(ghettoN[3]); break;
                case '4': System.out.print(ghettoN[4]); break;
                case '5': System.out.print(ghettoN[5]); break;
                case '6': System.out.print(ghettoN[6]); break;
                case '7': System.out.print(ghettoN[7]); break;
                case '8': System.out.print(ghettoN[8]); break;
                case '9': System.out.print(ghettoN[9]); break;
                default: System.out.println("Invalid input!"); break;
            }
        }
    }
}
/*
Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
        while (!sc.hasNext("z")) {
            char ch = sc.next().charAt(0);
            System.out.print("[" + ch + "] ");
        }
*/