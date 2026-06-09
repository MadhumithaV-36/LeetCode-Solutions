import java.util.*;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    // Push element
    public void push(int val) {
        
        stack.push(val);
        
        // Push to minStack if empty or smaller/equal
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    // Remove top element
    public void pop() {
        
        // If top is minimum remove from minStack too
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        
        stack.pop();
    }
    
    // Get top element
    public int top() {
        return stack.peek();
    }
    
    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
}