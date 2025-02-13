class Solution {

   int dp[][]=new int[21][21];


    public boolean isMatch(String s, String p) {
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return check(s, p, 0, 0);
      
    }

    public boolean check(String s, String p, int i, int j) {
        if (j == p.length()) {
            return i == s.length();
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }

      

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            dp[i][j] = (check(s, p, i, j + 2))?1:0;
            if (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
               dp[i][j]|= check(s, p, i + 1, j)?1:0;
            }
        } else if (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
           dp[i][j]= check(s, p, i + 1, j + 1)?1:0;
        }

        return dp[i][j]==1;
    }
}
