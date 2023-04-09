package org.example.Iterable;

public class IterableDemo {
    public static void main(String[] args) {
        TextList textList = new TextList();

        for (String text : textList){
            System.out.println(text.length());
            System.out.println(text);
        }
    }
}
