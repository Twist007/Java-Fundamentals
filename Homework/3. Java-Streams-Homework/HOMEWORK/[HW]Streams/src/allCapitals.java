import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by Ivelin on 10/20/2015.
 */
public class allCapitals {
    public static void main(String[] args) {

        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("resources/sumLines"))

        ) {

            ArrayList<String> data = new ArrayList<>();

            String line = fileReader.readLine();

            while (line != null) {

                line = line.toUpperCase();
                data.add(line);

                line = fileReader.readLine();
            }
            fileReader.close();

            BufferedWriter fileWriter = new BufferedWriter(
                    new PrintWriter(
                            new FileWriter("resources/sumLines")));

            for (int i = 0; i < data.size(); i++) {
                String ouput = data.get(i);

                fileWriter.write(ouput);
                fileWriter.newLine();

            }

            fileWriter.close();

        } catch (IOException ioex) {

        }
    }
}
