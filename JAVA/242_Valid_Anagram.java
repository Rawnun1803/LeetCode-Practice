// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Method 1: Count Array
//Time Complexity: O(n), Space Complexity: O(1)
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for(int i = 0, len = s.length(); i < len; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;            
        }
        for(int c : count) {
            if(c != 0)
                return false;
        }
        return true;
    }
}

//Method 2: Count Array (ASCII)
//Time Complexity: O(n), Space Complexity: O(1)
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int count[] = new int[128];

        for(char c: s.toCharArray()){
            ++count[c];

        }
        for(char c: t.toCharArray()){
            if(--count[c] < 0){
                return false;
            }
        }
        return true;
    }
}