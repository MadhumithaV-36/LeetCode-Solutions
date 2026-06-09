import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        // Create boolean array
        boolean[] present = new boolean[nums.length + 1];
        
        // Mark numbers present
        for (int num : nums) {
            present[num] = true;
        }
        
        // Find missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }
        
        return result;
    }
}