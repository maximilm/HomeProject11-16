package ru.mirea.java.practice11.Queue;

public class LinkedQueue extends AbstactQueue {
    private Knot head = null;
    private Knot tail = null;

    @Override
    protected boolean doEnqueue(Object element) {
        Knot kn = new Knot(element);
        if (size() == 0){
            head = kn;
            tail = kn;
        }
        else {
            tail.next = kn;
            kn.prev = tail;
            tail = kn;
        }
        return true;
    }

    @Override
    protected Object doDequeue() {
        Object ret = head.key;
        if (size() != 1){
            head = head.next;
            head.prev = null;
        } else {
            head = null;
            tail = null;
        }
        return ret;
    }

    @Override
    protected void doPush(Object element) {
        Knot kn = new Knot(element);
        if (size() == 0){
            head = kn;
            tail = kn;
        }
        else {
           kn.next = head;
           head.prev = kn;
           head = kn;
        }
    }
}
