import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ivelin on 10/20/2015.
 */
public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(
                                         new FileReader("resources/sumLines"));
        ) {

            String line = fileReader.readLine();
            while (line != null) {

                int charSum = 0;

                for (int i = 0; i < line.length() ; i++) {

                    charSum += line.charAt(i);

                }

                System.out.println(charSum);
                line = fileReader.readLine();
            }

        } catch (IOException ioex) {
            System.err.println("Cannot read file.");
        }
    }
}
