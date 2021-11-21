package ru.mirea.java.practice27.practice28;

import java.io.File;
import java.lang.String;

public class Main
{

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        // т.к. ядер на компьютере 8,  пусть каждое ядро обрабатывает по 3 картинки из файла, в котором 24 картинки
        MyThread thread0  = new MyThread(0);
        MyThread thread1  = new MyThread(3);
        MyThread thread2  = new MyThread(6);
        MyThread thread3  = new MyThread(9);
        MyThread thread4  = new MyThread(12);
        MyThread thread5  = new MyThread(15);
        MyThread thread6  = new MyThread(18);
        MyThread thread7  = new MyThread(21);
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        try{ // подождем окончание каждого потока
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
        }catch(InterruptedException e){}

        System.out.println("Duration: " + (System.currentTimeMillis()-start));
        System.out.println("Количество ядер процессора: " + Runtime.getRuntime().availableProcessors());
    }
}
