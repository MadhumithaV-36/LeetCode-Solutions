import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Store frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Max Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        
        // Add all keys to heap
        pq.addAll(map.keySet());
        
        // Get top k elements
        int[] result = new int[k];
        
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }
}