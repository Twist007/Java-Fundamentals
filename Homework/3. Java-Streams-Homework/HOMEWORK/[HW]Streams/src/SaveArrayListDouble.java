import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ivelin on 10/23/2015.
 */
public class SaveArrayListDouble {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(
                "resources/double.list"));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(5.6);
        doubles.add(45.6);
        doubles.add(3.46);
        oos.writeObject(doubles);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("resources/double.list"));
        System.out.println(ois.readObject());
        ois.close();


    }
}
