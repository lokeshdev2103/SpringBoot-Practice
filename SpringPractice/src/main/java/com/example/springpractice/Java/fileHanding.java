package com.example.springpractice.Java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHanding {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter writer = new FileWriter("lokesh.txt");
            writer.write("Hello Java");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("lokesh.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
