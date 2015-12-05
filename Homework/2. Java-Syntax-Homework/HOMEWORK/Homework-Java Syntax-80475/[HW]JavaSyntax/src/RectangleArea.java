import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]params = input.nextLine().split(" ");
        System.out.println(Integer.parseInt(params[0])*Integer.parseInt(params[1]));
    }
}
