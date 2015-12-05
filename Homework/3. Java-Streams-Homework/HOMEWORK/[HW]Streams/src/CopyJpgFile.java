import java.io.*;

/**
 * Created by Ivelin on 10/20/2015.
 */
public class CopyJpgFile {
    private  static final String path = "resources/picture.jpg";
    private  static final String pathToCoppy = "resources/my-copied-picture.jpg";

    public static void main(String[] args) throws IOException {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(path));
            os = new FileOutputStream(new File(pathToCoppy));
            byte[] buffer = new byte[2048];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        is.close();
        os.close();

    }
}
