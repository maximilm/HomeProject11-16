package ru.mirea.java.practice11.Queue;

public class Knot {
    Object key;
    Knot next;
    Knot prev;

    public Knot(Object key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}
