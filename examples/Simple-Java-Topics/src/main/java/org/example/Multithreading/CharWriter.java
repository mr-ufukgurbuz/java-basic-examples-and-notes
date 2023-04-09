package org.example.Multithreading;

public class CharWriter implements Runnable{

    private char character;
    private  int counterOfWriting;
    private int i;

    // Sinifa ait parametresiz yapilandirici
    public CharWriter() {
    }

    // Sinifa ait parametre alan yapilandirici
    public CharWriter(char character, int counterOfWriting) {
        this.character = character;
        this.counterOfWriting = counterOfWriting;
    }

    // Runable arabiriminin run metodu override edildi.

    @Override
    public void run() {
        // for dongusu icinde karakterler ekrana yazdirilir.
        for (i = 0; i< counterOfWriting; i++){
            System.out.println(character);
        }
    }
}
