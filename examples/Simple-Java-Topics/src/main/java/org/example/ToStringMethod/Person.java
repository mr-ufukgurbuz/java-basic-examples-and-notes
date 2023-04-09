package org.example.ToStringMethod;

public class Person {
    private int Id;
    private String name;

    public Person(int id, String name) {
        this.Id = id;
        this.name = name;
    }

    public String toString() {
        return String.format("%-4d: %s", Id, name);
    }
}
