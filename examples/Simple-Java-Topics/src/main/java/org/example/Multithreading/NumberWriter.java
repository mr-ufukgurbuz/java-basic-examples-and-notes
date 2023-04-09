package org.example.Multithreading;

public class NumberWriter implements Runnable{
    private int numbers;
    private int countOfWriting;
    private int i;

    public NumberWriter() {
    }

    public NumberWriter(int numbers, int countOfWriting) {
        this.numbers = numbers;
        this.countOfWriting = countOfWriting;
    }

    @Override
    public void run() {
        // for dongusu icinde rakamalar ekrana yazdirilir.
        for (i = 0; i< countOfWriting; i++){
            System.out.println(numbers);
        }
    }

}
