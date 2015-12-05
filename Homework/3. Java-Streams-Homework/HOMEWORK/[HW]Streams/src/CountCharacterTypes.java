import java.io.*;

/**
 * Created by Ivelin on 10/20/2015.
 */
public class CountCharacterTypes {
    public static void main(String[] args) {

        try (BufferedReader fr = new BufferedReader(
                new FileReader("resources/words"))
        ) {
            String line = fr.readLine();
            int vowes = 0;
            int consonants = 0;
            int punctuation = 0;

            while (line != null) {

                for (int i = 0; i < line.length(); i++) {

                    switch (line.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowes++;
                            break;
                        case '!':
                        case '?':
                        case '.':
                        case ',':
                            punctuation++;
                            break;
                        default:
                            consonants++;
                            break;
                    }
                }

                BufferedWriter fw = new BufferedWriter(
                        new FileWriter("resources/count-chars"));
                fw.write("Vowels: " + vowes);
                fw.newLine();
                fw.write("Consonants: " + consonants);
                fw.newLine();
                fw.write("Punctuation: " + punctuation);
                fw.flush();


                line = fr.readLine();
            }


        } catch (IOException ioex) {

        }

    }
}
