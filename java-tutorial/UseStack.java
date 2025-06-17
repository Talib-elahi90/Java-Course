// Stack represents Last-in-first-out(LIFO) stack of objects. 
// It extends class Vector with five operations that allow a vector to be treated as a Vector.

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(11);
        System.out.println(stack.peek());
        System.out.println("Before pop "+ stack.size());
        System.out.println("Index "+ stack.search(3));
        System.out.println(stack.pop());
        System.out.println("After pop "+ stack.size());
    }
}
