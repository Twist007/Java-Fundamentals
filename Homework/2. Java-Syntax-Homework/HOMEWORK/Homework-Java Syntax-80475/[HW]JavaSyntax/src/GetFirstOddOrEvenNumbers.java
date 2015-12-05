import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenNumbers {
    public static List<Integer> oddOrEvenElements(String[]numbers,String[]command) {
        int[]convertedToIntNums =new int[numbers.length];
        int counter = Integer.parseInt(command[1]);
        List<Integer>elements = new ArrayList<Integer>();
        for (int i = 0; i <convertedToIntNums.length ; i++) {
            convertedToIntNums[i] = Integer.parseInt(numbers[i]);
            if (command[2].equals("odd")&& convertedToIntNums[i]%2!=0 && counter>0) {
            elements.add(convertedToIntNums[i]);
                counter--;
            }
            if (command[2].equals("even") && convertedToIntNums[i]%2==0 && counter>0) {
                elements.add(convertedToIntNums[i]);
                counter--;
            }
        }
        return elements;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String[]numbers = input.nextLine().split(" ");
        String[]command = input.nextLine().split(" ");
        List<Integer>elements = oddOrEvenElements(numbers,command);
        for (int i = 0; i <elements.size() ; i++) {
            System.out.print(elements.get(i)+" ");
        }


    }
}
