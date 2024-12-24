class Solution {
    public String longestPalindrome(String s) {
      int n = s.length();
        if (n < 2) return s;

        int start = 0, maxLength = 1;

        for (int i = 0; i < n; i++) {
            //  odd-length palindromes
            int len1 = length(s, i, i);

            // for even-length palindromes
            int len2 = length(s, i, i + 1);

            int currLength = Math.max(len1, len2);

            if (currLength > maxLength) {
                maxLength = currLength;
                start = i - (currLength - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

     private int length(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return (right-1) - (left+1)+ 1; // Length of the palindrome.
    }
}