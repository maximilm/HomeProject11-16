package ru.mirea.java.practice11;

import ru.mirea.java.practice11.Queue.*;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule q1= new ArrayQueueModule();
        ArrayQueueADT q2 = new ArrayQueueADT();
        ArrayQueue q3 = new ArrayQueue();
        LinkedQueue q4 = new LinkedQueue();
        for (int i = 0; i < 30; i = i + 6) {
            q1.enqueue(i);
            ArrayQueueADT.enqueue(q2,i);
            q3.enqueue(i);
            q4.enqueue(i);
        }
        System.out.print('\n'+"Module:" + '\n');
        for (int i = 0; i < 30; i = i + 6){
            System.out.println(q1.dequeue());
        }
        System.out.print('\n'+"ADT:" + '\n');
        for (int i = 0; i < 30; i = i + 6){
            System.out.println(ArrayQueueADT.dequeue(q2));
        }
        System.out.print('\n'+"Queue:" + '\n');
        for (int i = 0; i < 30; i = i + 6){
            System.out.println(q3.dequeue());
        }
        System.out.print('\n'+"linked:" + '\n');
        for (int i = 0; i < 30; i = i + 6){
            System.out.println(q4.dequeue());
        }
        if (q1.isEmpty() && ArrayQueueADT.isEmpty(q2) && q3.isEmpty() && q4.isEmpty())
            System.out.println("All queue is empty");
        System.out.println("Function clear");
        for (int i = 0; i < 30; i = i + 6) {
            q1.enqueue(i);
            ArrayQueueADT.enqueue(q2,i);
            q3.enqueue(i);
            q4.enqueue(i);
        }
        q1.clear();
        ArrayQueueADT.clear(q2);
        q3.clear();
        q4.clear();
        if (q1.isEmpty() && ArrayQueueADT.isEmpty(q2) && q3.isEmpty() && q4.isEmpty())
            System.out.println("All queue is empty");
    }
}
