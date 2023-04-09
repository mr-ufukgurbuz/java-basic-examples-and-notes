package org.example.Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorsDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();

        while (it.hasNext()){
            String value = it.next();
            System.out.println(value);

            if (value.equals("cat")){
                it.remove();
            }
        }
        System.out.println();

        // **************************************
        // Modern iterator Java 5 and later.
        for (String animal: animals){
            System.out.println(animal);

            // animals.remove(2);
        }
    }
}
