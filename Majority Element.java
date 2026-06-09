class Solution {
    public int majorityElement(int[] nums) {
        
        int candidate = 0;
        int count = 0;
        
        for (int num : nums) {
            
            // If count becomes 0
            if (count == 0) {
                candidate = num;
            }
            
            // Increase or decrease count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}