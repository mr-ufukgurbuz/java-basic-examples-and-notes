package org.example.Enums;

public class EnumsDemo {
    public static void main(String[] args) {
        Days days = Days.Sali;
        System.out.println(days);

        Months months = Months.Nisan;
        System.out.println(months + " yilin " + months.getMonth() +". ayidir.");
    }
}
