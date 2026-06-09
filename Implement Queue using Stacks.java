import java.util.*;

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Push element to queue
    public void push(int x) {
        stack1.push(x);
    }
    
    // Remove front element
    public int pop() {
        
        // Move elements if stack2 empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
    }
    
    // Get front element
    public int peek() {
        
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.peek();
    }
    
    // Check queue empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}