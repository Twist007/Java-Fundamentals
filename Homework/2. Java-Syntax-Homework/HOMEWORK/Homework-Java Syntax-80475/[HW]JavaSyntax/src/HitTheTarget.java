import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());
        for (int i = 0; i <=20 ; i++) {
            for (int j = 0; j <=20 ; j++) {
                int a = i;
                int b = j;
                if (a+b == target) {
                    System.out.printf("%d + %d = %d",a,b,target);
                    System.out.println();
                }
            }
        }
        for (int i = 0; i <=20 ; i++) {
            for (int j = 0; j <=20 ; j++) {
                int a =i;
                int b = j;
                if (a-b == target) {
                    System.out.printf("%d - %d = %d",a,b,target);
                    System.out.println();
                }
            }
        }
    }
}
