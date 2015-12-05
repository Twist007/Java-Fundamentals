import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("\\s+")));
        ArrayList<String> filteredList = new ArrayList<String>(list.stream().filter(p -> p.length() > 3).collect(Collectors.toList()));
        if(filteredList.size()!=0) {
            for (String s : filteredList) {
                System.out.print(s + " ");
            }
        }
    }
}
