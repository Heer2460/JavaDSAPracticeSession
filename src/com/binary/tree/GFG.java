package com.binary.tree;
//lock.docx
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args) throws IOException {
        // Assigning the content of the file
        String text = "Welcome to geekforgeeks\nHappy Learning!";

        // Defining the file name of the file
        Path fileName = Path.of("C:\\Users\\admin\\Desktop\\lock.docx");

        // Writing into the file
        Files.writeString(fileName, text);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println(file_content);
    }
}
