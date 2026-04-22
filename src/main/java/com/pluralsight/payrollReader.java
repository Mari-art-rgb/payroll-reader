package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import java.io.*;
import java.util.regex.Pattern;

public class payrollReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);

            String input;
            buffReader.readLine();

            while(input = buffReader.readLine()) != null) {
                String[] splitData = input.split(Pattern.quote("|"));
                int id = Integer.parseInt(splitData[0]);
                String name = splitData[1];
                double hoursWorked = Double.parseDouble(splitData[2]);
                double payRate = Double.parseDouble(splitData[3]);

                System.out.println(id);
                System.out.println(name);
            }

            buffReader.close();


        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
          e.printStackTrace();


        }


    }

}
