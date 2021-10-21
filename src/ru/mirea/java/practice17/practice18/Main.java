package ru.mirea.java.practice17.practice18;

import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher( s );
        boolean b = m1.matches();
        if (b) System.out.println("yes");
        else System.out.println("no");

        //01:23:45:67:89:Az
        //01:23:45:67:89:Af
        String regex = "(([a-f]|[A-F]|\\d)+:){5}(([a-f]|[A-F]|\\d)+)" ;
        s = in.nextLine();
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        b = m2.matches();
        if (b) System.out.println("yes");
        else System.out.println("no");

        regex = "(\\d+)([.]?)(\\d*)(\\s)(USD|RUR|EU)";
        s = in.nextLine();//Цены 5.7 USD 5 RUR 640 CHF 11,23 RUR
        Pattern p3 = Pattern. compile(regex);
        Matcher m3 = p3.matcher(s);
        while (m3.find()) {
            System.out.println("Список цен: " + m3.group());}
    }
}
