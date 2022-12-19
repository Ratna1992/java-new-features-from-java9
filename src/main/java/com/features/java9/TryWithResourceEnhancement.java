package com.features.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceEnhancement {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
        try (fileStream) {
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
