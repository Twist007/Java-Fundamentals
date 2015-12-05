package com.company;

import java.io.*;

public class Main {

    private static final String File_Path = "E:\\SoftUni\\1.Fundamental Level\\Java Fundamentals\\Lectures\\3. Java-Streams\\users.txt";
    private static final String Save_Path = "E:\\SoftUni\\1.Fundamental Level\\Java Fundamentals\\Lectures\\3. Java-Streams\\total-time.txt";

    public static void main(String[] args) {
        File file = new File(File_Path);
        File outputFile = new File(Save_Path);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            FileWriter fileWriter = new FileWriter(outputFile, true);
            PrintWriter writer = new PrintWriter(fileWriter, true);

            String line = reader.readLine();
            while (line != null) {
                String[] lineArgs = line.split(" ");
                String username = lineArgs[0];
                int totalMinutes = 0;
                for (int i = 1; i < lineArgs.length; i++) {
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalMinutes += (hours * 60) + minutes;
                }

                String output = username + " " + totalMinutes;
                int days = totalMinutes / 1440;
                int totalHours = totalMinutes / 60;//days/60
                int minutes = totalMinutes - (totalHours * 60);//

                output += " (" + days + " days, " + totalHours + " hours, " + minutes + " minutes)";
                writer.println(output);

                line = reader.readLine();
            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
