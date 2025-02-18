import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {
        
        int dp[][] = new int[s.length() + 1][p.length() + 1];

        for (int i = 0; i <= s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(s, p, 0, 0, dp);
    }

    public boolean solve(String s, String p, int i, int j, int dp[][]) {
    
        if (dp[i][j] != -1) return dp[i][j] == 1;

        if (i >= s.length() && j >= p.length()) return true;

        if (j >= p.length()) return false;

        if (i >= s.length()) {
            while (j < p.length() && p.charAt(j) == '*') j++; // Skip all '*'
            dp[i][j] = (j == p.length()) ? 1 : 0;
            return dp[i][j] == 1;
        }

        boolean ans = false;

        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
            ans = solve(s, p, i + 1, j + 1, dp); 
        } 
   
        else if (p.charAt(j) == '*') {
            ans = solve(s, p, i + 1, j, dp)  // '*' matches current character
                || solve(s, p, i, j + 1, dp); // '*' matches empty sequence
        }

        dp[i][j] = ans ? 1 : 0;
        return ans;
    }
}

