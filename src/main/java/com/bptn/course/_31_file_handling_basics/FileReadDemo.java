package com.bptn.course._31_file_handling_basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            FileReader reader = new FileReader("student.txt");
            bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {  // Fixed the syntax error here
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in the finally block to ensure it's closed even if an exception occurs
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
