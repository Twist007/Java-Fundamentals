package com.company;

import java.io.*;

/*
Write a program that copies the contents of a .jpg file to another using FileInputStream, FileOutputStream,
and byte[] buffer. Set the name of the new file as my-copied-picture.jpg.
*/
public class p04_Copy_jpgFile {
    public static void main(String[] args) {
        try (
                BufferedInputStream bfis =
                        new BufferedInputStream(new FileInputStream("resources/index.jpg"));
                BufferedOutputStream bfos =
                        new BufferedOutputStream(new FileOutputStream("resources/index_out.jpg"))
        ){
            int i;
            while ((i = bfis.read()) != -1) {
                bfos.write((char)i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
