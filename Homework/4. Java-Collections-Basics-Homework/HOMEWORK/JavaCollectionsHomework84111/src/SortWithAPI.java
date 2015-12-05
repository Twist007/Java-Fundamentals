import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Oriya on 28-Oct-15.
 */
public class SortWithAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        String order = scanner.nextLine();
        if(order.equals("Ascending")){
            list.stream().sorted().forEach(s -> System.out.print(s+ " "));
        }else {
            list = new ArrayList<String>(list.stream().sorted().collect(Collectors.toList()));
            Collections.reverse(list);
            list.forEach(s -> System.out.print(s+ " "));
        }

    }
}
