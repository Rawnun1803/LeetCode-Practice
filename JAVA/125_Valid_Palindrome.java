// 125. Valid Palindrome
// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// Method 1: StringBuilder
// Time Complexity: O(n), Space Complexity: O(n)
class Solution1 {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));
            }
        }

        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false; // mismatch found
            }
        }

        return true; // palindrome
    }
}

// Method 2: StringBuilder (optimized)
// Time Complexity: O(n), Space Complexity: O(n)
class Solution2 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(s.charAt(i)));
        }
        int len = sb.length();
        for (int i = 0; i < len / 2; i++) {
            if (sb.charAt(i) != sb.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// Method 3: Two Pointers
// Time Complexity: O(n), Space Complexity: O(1)
class Solution3 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // Compare in lowercase
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
