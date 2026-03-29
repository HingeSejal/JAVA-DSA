package AdvJava.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePgm {
    public static void main(String[] args) {
        
        Queue<String> q = new LinkedList<>();
        q.add("Pune");
        q.add("Sahyandri");    
        q.add("Gondia");

        System.out.println("Queue" + q);

        // Accessing elements
        System.out.println("Top element: " + q.peek());

        // Removing an element
        q.remove();
        System.out.println("After removing from front element: " + q);

        // Size of the Queue
        System.out.println("Size of Queue: " + q.size()); //no of elements in queue

        System.out.println("Is queue empty? " + q.isEmpty());

        

    }
}

//FIFO - First In First Out
/*
suppose u want to remove elements from linkedlist , it uses fifo principle which issame as queue
hence instead of wrting code for queue
we can implement queue using linkedlist

class linkdelist implements queue
{
    add() - add element to the end of the list
    remove() - remove element from the front of the list
    peek() - return the front element without removing it
    size() - return the number of elements in the queue
    isEmpty() - check if the queue is empty
}

Queue q = new LinkedList<>();
in core java we learnt that interface cannot be instantiated (queue interface)
hence here we r creating object of linkedlist class which implements queue interface
*/