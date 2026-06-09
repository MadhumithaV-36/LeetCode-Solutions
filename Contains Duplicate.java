import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            
            // If already exists
            if (set.contains(num)) {
                return true;
            }
            
            // Add element
            set.add(num);
        }
        
        return false;
    }
}