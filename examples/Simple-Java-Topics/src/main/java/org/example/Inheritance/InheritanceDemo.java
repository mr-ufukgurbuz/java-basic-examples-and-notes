package org.example.Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.stop();

        Car c1 = new Car();
        c1.start();
        c1.wipeWindShield();
        c1.showInfo();
        c1.stop();
    }
}
