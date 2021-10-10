package ru.mirea.java.practice11.Queue;

public class ArrayQueue extends AbstactQueue {
    final int sizeQ = 5;
    private int front = -1;
    private int rear = -1;
    private Object[] elements = new Object[sizeQ];

    // PRE:  None
    // POST: front != rear
    //       rear - front < size
    protected boolean doEnqueue(Object element) {
        if (size() == elements.length) {
            System.out.println("Очередь заполнена.");
            return false;
        }
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % sizeQ;
            elements[rear] = element;
            return true;
        }
    }
    // PRE:  size > 0
    // POST: Object return = queue[head]
    //       newSize = size - 1
    //       queue[front+1]..queue[rear] - immutable
    protected Object doDequeue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Очередь пуста.");
            return null;
        }
        else{
            element = elements[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }
            else
                front = (front + 1) % sizeQ;
        }
        return element;
    }

    protected void doPush(Object element) {
        if (front == 0)
            front = 4;
        else
            front = front -1;
        elements[front] = element;
    }
}
