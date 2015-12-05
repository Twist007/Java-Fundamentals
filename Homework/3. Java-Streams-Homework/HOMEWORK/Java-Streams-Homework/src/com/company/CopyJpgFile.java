package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\Flash.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Java\\my-copied-picture.jpg");
        int byteContainer;
        while((byteContainer = fis.read())!=-1)
        {
            fos.write(byteContainer);
        }
        fis.close();
        fos.close();
    }
}
