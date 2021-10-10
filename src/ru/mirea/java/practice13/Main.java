package ru.mirea.java.practice13;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адреса, где разделители будут запятые: ");
        String address = in.nextLine();
        Address ad1 = new Address(address);
        System.out.println(ad1.toString());
        address = in.nextLine();
        Address ad2 = new Address(address);
        System.out.println(ad2.toString());
    }
}
// Россия,Шатурская область,Шатура,улица энергетиков,дом 22/14,к1,квартира 48
// Россия,Москвоская область,Москва,улица Вернандский проспект