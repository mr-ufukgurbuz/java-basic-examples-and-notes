package org.example.FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingAndWritingFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Deneme123");
            bufferedWriter.newLine();
            bufferedWriter.write("Deneme456");;
            bufferedWriter.newLine();
        }
        catch (IOException ex)
        {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
