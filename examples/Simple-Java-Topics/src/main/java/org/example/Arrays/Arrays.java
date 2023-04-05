package org.example.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int value = 7;
        int[] values = new int[3];
        //double[] latitudes = new double[20];
        values[0]=10;
        values[1]=20;
        values[2]=30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {1,2,3};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // STRING Arrays
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "Hi";
        words[2] = "Selam";

        String[] fruits = {"banana", "apple", "pineapple"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
