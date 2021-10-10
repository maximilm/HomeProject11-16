package ru.mirea.java.practice12;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Samoilenko", "Maxim", "Andreevich");
        Person p2 = new Person("Utkin");
        System.out.println(p1.FIO());
        System.out.println(p2.FIO());
    }
}
