import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>baseSevenNum = new ArrayList<Integer>();
        int inputNumber = Integer.parseInt(input.nextLine());
       while(true){
           int remainder = inputNumber % 7;
           baseSevenNum.add(remainder);
           inputNumber/= 7;
           if (inputNumber == 1) {
               baseSevenNum.add(inputNumber);
               break;
           }
           if (inputNumber<1) {
               break;
           }
       }
        for (int i = baseSevenNum.size()-1; i>=0 ; i--) {
            System.out.print(baseSevenNum.get(i));
        }

    }
}
