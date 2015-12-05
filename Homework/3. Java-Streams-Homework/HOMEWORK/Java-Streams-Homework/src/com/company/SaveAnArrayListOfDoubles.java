package com.company;

import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(
                "D:\\Java\\doubles.list"));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(6.8);
        doubles.add(82.7);
        doubles.add(5.79);
        oos.writeObject(doubles);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\Java\\doubles.list"));
        System.out.println(ois.readObject());
        ois.close();


    }
}