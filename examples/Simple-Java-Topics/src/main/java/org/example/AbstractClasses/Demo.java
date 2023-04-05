package org.example.AbstractClasses;

public class Demo {
    public static void main(String[]args)
    {
        Television television = new Television();
        television.setId(101);

        Phone phone = new Phone();
        phone.setId(301);

        television.run();
        phone.run();
    }
}
