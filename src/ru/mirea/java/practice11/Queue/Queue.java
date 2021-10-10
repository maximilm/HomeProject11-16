package ru.mirea.java.practice11.Queue;

// INV: FIFO(First in - First out)
//      size >=0
public interface Queue {
    // Pre: None
    // Post: queue[tail] = newElement
    //       newSize = lastsize + 1
    void enqueue(Object ad);
    // PRE: size > 0
    // POST: returnEleemnt = queue[head]
    //       queue - immutable
    Object element();
    // PRE: size > 0
    // POST: newSize = lastSize - 1
    //       newQueue[head] = lastQueue[head +1]
    Object dequeue();
    // PRE: None
    // Post: returnInt = size
    int size();
    // PRE: None
    // POST: returnInt = false/true(size != 0 : size == 0)
    boolean isEmpty();
    // PRE: None
    // POST: size = 0
    void clear();
    // PRE:  None
    // POST: queue[head] = elementWhoNowCalledElement
    //       newSize = lastSize + 1
    void push(Object element);
}
