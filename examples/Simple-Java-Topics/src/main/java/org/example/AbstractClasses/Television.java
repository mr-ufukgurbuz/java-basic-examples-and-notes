package org.example.AbstractClasses;

public class Television extends Machine{
    @Override
    public void start() {
        System.out.println("Starting Television..");
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something Television..");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Television..");
    }
}
