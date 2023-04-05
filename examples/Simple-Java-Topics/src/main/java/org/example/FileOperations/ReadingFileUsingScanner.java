package org.example.FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "example.txt";

        File textFile = new File(fileName);

        Scanner scanner = new Scanner(textFile);

        int value = scanner.nextInt();
        System.out.println("The read value: " + value);

        scanner.nextLine();
        int count = 2;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
        scanner.close();
    }
}
