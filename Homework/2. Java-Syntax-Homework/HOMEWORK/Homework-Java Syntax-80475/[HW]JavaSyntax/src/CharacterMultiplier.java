import java.util.Scanner;

public class CharacterMultiplier {
    public static int charactersValueMultiplication(String a,String b){
       int minLength = Math.min(a.length(),b.length());
        int maxLength = Math.max(a.length(),b.length());
        int result =0;
        for (int i = 0; i <maxLength; i++) {
            if (i<minLength) {
            result += a.charAt(i) * b.charAt(i);
            }
            if (i>=minLength && a.length()==maxLength) {
                result+=a.charAt(i);
            }
            if (i>=minLength && b.length()==maxLength) {
                result+=b.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]sentence = input.nextLine().split(" ");
        int result = charactersValueMultiplication(sentence[0],sentence[1]);
        System.out.println(result);

    }
}
