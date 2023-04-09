package org.example.Exceptions.MultipleExceptions;

import java.io.IOException;

public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
