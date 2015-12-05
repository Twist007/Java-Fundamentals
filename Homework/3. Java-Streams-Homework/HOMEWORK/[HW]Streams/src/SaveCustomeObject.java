import java.io.*;

/**
 * Created by Ivelin on 10/23/2015.
 */
public class SaveCustomeObject  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("resources/file"));
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("resources/files.save"));
        Course newCourse = new Course("Java Fundamentals",150);
        oos.writeObject(newCourse);
        Course readerObject = (Course)ois.readObject();
        readerObject.printInfo();
    }

    private static class Course {
        public Course(String name, int numb) {
            this.name = name;
            this.numb = numb;
        }

        String name;
        int numb;
        public void printInfo() {

            System.out.println(name);
            System.out.println(numb);
        }
    }
}
