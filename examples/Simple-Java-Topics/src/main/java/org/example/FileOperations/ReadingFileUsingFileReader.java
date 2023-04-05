package org.example.FileOperations;

import java.io.*;

public class ReadingFileUsingFileReader {
    public static void main(String[] args) {
        File file = new File("example2.txt");
        BufferedReader bufferedReader = null;

        try{
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            try {
                while ( (line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Unable to read file: " + file.toString());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        finally {
            try {
                bufferedReader.close();
            } catch (NullPointerException ex){
                //File was probably never opened!

            } catch (Exception e) {
                System.out.println("Unable to close file: " + file.toString());
            }
        }
        }
}
