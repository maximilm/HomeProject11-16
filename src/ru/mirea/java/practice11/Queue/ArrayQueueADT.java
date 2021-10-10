package ru.mirea.java.practice11.Queue;
// INV: FIFO (First in - first out)
//      size >= 0
//      queue[head]..queue[tail] - queue
//      -1 <= front, rear < 5
public class ArrayQueueADT {
    private  final int sizeQ = 5;
    private  int front = -1;
    private  int rear = -1;
    private  int size = 0;
    private  Object[] elements = new Object[sizeQ];

    // PRE:  queue - not nullable
    // POST: queue[tail] = element
    //       size' = size + 1
    //       queue[head]..queue[tail-1] - immutable
    public  static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.size == queue.elements.length)
            System.out.println("Очередь заполнена.");
        else {
            if (queue.front == -1)
                queue.front = 0;
            queue.rear = (queue.rear + 1) % queue.sizeQ;
            queue.elements[queue.rear] = element;
            queue.size++;
        }
    }

    // PRE:  size > 0
    //       queue - not nullable
    // POST: R = queue[head]
    //       queue - immutable
    public static Object element(ArrayQueueADT queue) {
        if ( isEmpty(queue)) {
            System.out.println("Очередь пуста.");
            return null;
        }
        else {
            return queue.elements[queue.front];
        }
    }

    // PRE:  size > 0
    //       queue - not nullable
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       size' = size - 1
    //       queue[head+1]..queue[tail] - immutable
    public static Object dequeue(ArrayQueueADT queue) {
        Object element;
        if (isEmpty(queue)) {
            System.out.println("Очередь пуста.");
            return null;
        }
        else{
            element = queue.elements[queue.front];
            if (queue.front == queue.rear){
                queue.front = -1;
                queue.rear = -1;
            }
            else
                queue.front = (queue.front + 1) % queue.sizeQ;
        }
        queue.size--;
        return element;
    }

    // PRE:  queue - not nullable
    // POST: R = size
    //       queue - immutable
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // PRE:  queue - not nullable
    // POST: queue - immutable
    //       R = (size == 0)
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // PRE:  queue - not nullable
    // POST: size == 0
    public static void clear(ArrayQueueADT queue) {
        while (queue.size > 0) {
            dequeue(queue);
        }
    }
}
