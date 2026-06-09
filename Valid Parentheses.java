import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            // Closing brackets
            else {
                
                // Stack empty means invalid
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Stack should be empty
        return stack.isEmpty();
    }
}