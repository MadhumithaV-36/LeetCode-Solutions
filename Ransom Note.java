class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26];
        
        // Count letters in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        
        // Check ransomNote letters
        for (char ch : ransomNote.toCharArray()) {
            
            // Letter not available
            if (count[ch - 'a'] == 0) {
                return false;
            }
            
            // Use one letter
            count[ch - 'a']--;
        }
        
        return true;
    }
}