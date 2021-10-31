package ru.mirea.java.practice21.practice22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frame karkas = new Frame();
        Scanner in = new Scanner(System.in);
        String YN;
        do {
            karkas.newDocument();
            karkas.open();
            karkas.save();
            karkas.exit();
            System.out.println("Создать еще один ? Y/N");
            YN = in.nextLine();
        } while(YN.equals("Y"));
    }
}
