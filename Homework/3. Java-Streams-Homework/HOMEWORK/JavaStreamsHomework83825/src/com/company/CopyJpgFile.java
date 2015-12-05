package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyJpgFile {
    public static void main(String[] args) {
        try(
                FileInputStream fis =
                        new FileInputStream("res/pic.jpg");
                FileOutputStream fos =
                        new FileOutputStream("res/my-copied-picture.jpg")
        ){
            int i;
            byte[] buffer = new byte[4096];
            while((i = fis.read(buffer)) > 0){
                fos.write(buffer, 0, i);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
