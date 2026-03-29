package AdvJava.Collection;

import java.util.Stack;

public class StackPgm {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        stack.push("Pune");
        stack.push("Sahyandri");    
        stack.push("Gondia");

        System.out.println("Stack: " + stack);

        // Accessing elements
        System.out.println("Top element: " + stack.peek());

        // Removing an element
        stack.pop();
        System.out.println("After popping top element: " + stack);

        // Size of the Stack
        System.out.println("Size of Stack: " + stack.size()); //no of elements in stack

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element
        int position = stack.search("Pune");
        if (position != -1) {
            System.out.println("'Pune' is at position: " + position); 
            // position is 2 because stack is 1-based indexed and top element is at position 1
        } else {
            System.out.println("'Pune' not found in the stack.");
        }

    }
}

//LIFO