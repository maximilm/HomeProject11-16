package ru.mirea.java.practice11.Queue;
// Inv: First in - first out
//      size >= 0
//      -1 <= front, rear < 5
public class ArrayQueueModule {
    private static final int sizeQ = 5;
    private static int front = -1;
    private static int rear = -1;
    private static int size = 0;
    private static Object[] elements = new Object[sizeQ];

    // PRE:  None
    // POST: front != rear
    //       rear - front < size
    public static void enqueue(Object element) {
        if (size == elements.length)
            System.out.println("Очередь заполнена.");
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % sizeQ;
            elements[rear] = element;
            size++;
        }
    }

    // PRE:  size > 0
    // POST: Object return = queue[head]
    //       queue - immutable
    public static Object element() {
        if (isEmpty()) {
            System.out.println("Очередь пуста.");
            return null;
        }
        else {
            return elements[front];
        }

    }

    // PRE:  size > 0
    // POST: Object return = queue[head]
    //       newSize = size - 1
    //       queue[front+1]..queue[rear] - immutable
    public static Object dequeue() {
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
        size--;
        return element;
    }

    // PRE:  None
    // POST: Object return = size
    //       queue - immutable
    public static int size() {
        return size;
    }

    // PRE:  None
    // POST: queue - immutable
    //       boolean return = (size == 0) false/true
    public static boolean isEmpty() {
        return size == 0;
    }

    // PRE:  None
    // POST: size == 0
    public static void clear() {
        while (size > 0) {
            dequeue();
        }
    }
}
