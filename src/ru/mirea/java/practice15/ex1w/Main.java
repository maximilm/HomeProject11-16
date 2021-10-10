package ru.mirea.java.practice15.ex1w;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer a = new StringBuffer("+104289652211");
        PhoneNumber k = new PhoneNumber();
        k.createPhoneNumber(a);
        System.out.println(k.toString());
        a.delete(0,a.length());
        a.append("+79175655655");
        k.createPhoneNumber(a);
        System.out.println(k.toString());
        a.delete(0,a.length());
        a.append("89175655655");
        k.createPhoneNumber(a);
        System.out.println(k.toString());
    }
}
