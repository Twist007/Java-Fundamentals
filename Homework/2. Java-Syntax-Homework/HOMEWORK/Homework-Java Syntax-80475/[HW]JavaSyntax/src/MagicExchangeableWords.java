import java.util.Scanner;

public class MagicExchangeableWords {
    public static boolean exchangeOrNot(String a,String b) {
        boolean IsExchageable = false;
        char[] firstString = a.toCharArray();
        char[] secondString = b.toCharArray();
        for (int i = 0; i < firstString.length - 1; i++) {
            if (firstString[i] == firstString[i + 1] && secondString[i] == secondString[i + 1]) {
                IsExchageable = true;
            } else if (firstString[i] == firstString[i + 1] && secondString[i] != secondString[i + 1] ||
                    firstString[i] != firstString[i + 1] && secondString[i] == secondString[i + 1]) {
                IsExchageable = false;
            } else if (firstString[i] != firstString[i + 1] && secondString[i] != secondString[i + 1]) {
                IsExchageable = true;
            }

        }
        return IsExchageable;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]sentence = input.nextLine().split(" ");
        boolean result =exchangeOrNot(sentence[0],sentence[1]);
        System.out.println(result);

    }
}
