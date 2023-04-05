package org.example.Loops;

import java.util.Scanner;

/*
    Dongu kosulu dongu sonunda kontrol eder. Yani kod blogu en az bir kez calistirilmis olur.
*/
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = 0;
        do{
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }while(value != 5);

        System.out.println("Finished, user entered number '5'.");
    }
}