package ru.mirea.java.practice19.practice20;

import java.util.*;

public class Main {
    static Map<Integer, String> letters = new HashMap<>();
    static int[] masDigits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String genNumber() {
        int dig = (int) (Math.random() * 10 + 0);
        String ret = letters.get((int)(Math.random() * 12 + 0)) + masDigits[dig]+masDigits[dig]+masDigits[dig] +
                letters.get((int)(Math.random() * 12 + 0))+letters.get((int)(Math.random() * 12 + 0))+ (int)(Math.random() * 199 + 1) ;
        return ret;
    }

    public static void main(String[] args) {
        letters.put(0, "А");
        letters.put(1, "В");
        letters.put(2, "Е");
        letters.put(3, "К");
        letters.put(4, "М");
        letters.put(5, "Н");
        letters.put(6, "О");
        letters.put(7, "Р");
        letters.put(8, "С");
        letters.put(9, "Т");
        letters.put(10, "У");
        letters.put(11, "Х");
        for (int i = 0; i < 10; i++) {
            System.out.println(genNumber());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++){
            String  k = genNumber();
            arrayList.add(k);
            treeSet.add(k);
            hashSet.add(k);
        }
        System.out.println(arrayList);

        Scanner in = new Scanner(System.in);
        boolean t;
        long beginTime, elapsedTime;
        int tt;
        String k1 = in.next();
        beginTime = System.nanoTime();
        t = arrayList.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск перебором: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск перебором: номер не найден, поиск занял " + elapsedTime +"нс");
        Collections.sort(arrayList);
        beginTime = System.nanoTime();
        tt = Collections.binarySearch(arrayList, k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (tt >=0) System.out.println("Поиск binarySearch: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск binarySearch: номер не найден, поиск занял " + elapsedTime +"нс");
        beginTime = System.nanoTime();
        t = treeSet.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск treeSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск treeSet: номер не найден, поиск занял " + elapsedTime +"нс");
        beginTime = System.nanoTime();
        t = hashSet.contains(k1);
        elapsedTime = System.nanoTime() - beginTime;
        if (t) System.out.println("Поиск hashSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск hashSet: номер не найден, поиск занял " + elapsedTime +"нс");

    }
}