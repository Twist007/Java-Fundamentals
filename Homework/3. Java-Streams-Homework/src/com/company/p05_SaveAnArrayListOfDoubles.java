package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream,
// ObjectOutputStream. Set the name of the new file as doubles.list
public class p05_SaveAnArrayListOfDoubles {

    private static  List<Double> doubleList;
    public static void main(String[] args) {
         doubleList=new ArrayList<Double>(){{
        addAll(Arrays.asList(1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9));
        }};

        saveList();
        loadList();

    }
    public static void saveList(){
        try
                (ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("resources/doubles.list"))
                ) {

            oos.writeObject(doubleList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadList(){
        try
                (ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("resources/doubles.list")
                )) {

            System.out.println(ois.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
