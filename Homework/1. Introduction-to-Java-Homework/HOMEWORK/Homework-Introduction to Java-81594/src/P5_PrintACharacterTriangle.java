import java.util.Scanner;

public class P5_PrintACharacterTriangle {
    public static void main (String[] arg) {
        System.out.print("Enter a number, please: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int n = Integer.parseInt(System.console().readLine());
        int count = 0;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print( (char) (j + 97) + " ");
            }
            System.out.println();
            if (i < n) {
                count++;
            } else {
                count--;
            }
        }
    }
}