import java.util.*;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Push element
    public void push(int x) {
        q1.offer(x);
    }
    
    // Remove top element
    public int pop() {
        
        // Move all except last element
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        
        int top = q1.poll();
        
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return top;
    }
    
    // Get top element
    public int top() {
        
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        
        int top = q1.poll();
        
        // Put back into q2
        q2.offer(top);
        
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return top;
    }
    
    // Check empty
    public boolean empty() {
        return q1.isEmpty();
    }
}