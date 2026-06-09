class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        
        // XOR all elements
        for (int num : nums) {
            result = result ^ num;
        }
        
        return result;
    }
}