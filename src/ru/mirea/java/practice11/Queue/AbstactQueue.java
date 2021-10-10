package ru.mirea.java.practice11.Queue;

public abstract class AbstactQueue implements Queue {
    private int size = 0;

    protected abstract boolean doEnqueue(Object element);

    protected abstract Object doDequeue();

    protected abstract void doPush(Object element);

    public void enqueue(Object ad) {
        if (doEnqueue(ad)) {
            size++;
        }
    }

    public Object element() {
        assert size > 0;
        Object ret = dequeue();
        if  (ret != null)
            push(ret);
        return ret;
    }

    public Object dequeue() {
        assert size > 0;
        Object ret= doDequeue();
        size--;
        return ret;
    }

    public int size() {
        return size;
    }

    public void clear() {
        while (size > 0) {
            dequeue();
        }
    }

    public  boolean isEmpty() {

        return size == 0;
    }

    public void push(Object element) {
        doPush(element);
        size++;
    }
}
