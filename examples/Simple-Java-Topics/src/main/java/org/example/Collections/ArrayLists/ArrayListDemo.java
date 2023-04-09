package org.example.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers.get(0));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("Number '%d': %d", i, numbers.get(i));
        }

        numbers.remove(numbers.size()-1);

        List<String> values = new ArrayList<String>();
    }
}
