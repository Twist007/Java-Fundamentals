import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]inputNums = input.nextLine().split(" ");
        if (inputNums.length%2!=0) {
            System.out.println("Invalid length");
        }
        else{
            for (int i = 0; i <inputNums.length-1 ; i+=2) {
                int firstNum = Integer.parseInt(inputNums[i]);
                int secondNum = Integer.parseInt(inputNums[i+1]);
                if (firstNum%2==0 && secondNum%2==0) {
                    System.out.printf("%d, %d -> both are even", firstNum, secondNum);
                    System.out.println();
                }
                else if (firstNum%2!=0 && secondNum%2!=0) {
                    System.out.printf("%d, %d -> both are odd", firstNum, secondNum);
                    System.out.println();
                }
                else{
                    System.out.printf("%d, %d -> different", firstNum, secondNum);
                    System.out.println();
                }
            }
        }
    }
}
