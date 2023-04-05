package org.example.AbstractClasses;

public abstract class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();

    public abstract void doSomething();

    public abstract void stop();

    public void run(){
        start();
        doSomething();
        stop();
    }


}
