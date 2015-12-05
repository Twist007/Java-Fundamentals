import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());
        double firstFormulae = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2))
                / ((Math.pow(a, 2) - Math.pow(b, 2)))), ((a + b + c) / (Math.sqrt(c))));
        double secondFormulae = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        double average = ((a + b + c) / 3) - ((firstFormulae + secondFormulae) / 2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormulae, secondFormulae, average);
    }
}
