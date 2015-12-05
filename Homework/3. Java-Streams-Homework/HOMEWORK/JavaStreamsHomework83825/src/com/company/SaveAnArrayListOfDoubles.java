package com.company;

import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.33);
        list.add(2.45);
        list.add(4.52);

        try(ObjectOutputStream dos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("res/doubles.list")))){
            dos.writeObject(list);
        } catch (IOException ex) {
            System.out.println(ex.toString());  
        }
    }
}