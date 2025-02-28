class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int t[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    t[i][j] = j;
                } else if (j == 0) {
                    t[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = 1 + Math.min(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        int i = n, j = m;

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                str.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (t[i - 1][j] < t[i][j - 1]) {
                str.append(s1.charAt(i - 1));
                i--;
            } else {
                str.append(s2.charAt(j - 1));
                j--;
            }
        }

        
        while (i > 0) {
            str.append(s1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            str.append(s2.charAt(j - 1));
            j--;
        }

        return str.reverse().toString();
    }


    

    public int solve(String s1, String s2, int i, int j ,Integer dp[][]){
    
    if(i==s1.length()||j==s2.length()){
        return s1.length()-i+s2.length()-j;
    }

    if(dp[i][j]!=null) return dp[i][j];


      
      if(s1.charAt(i)==s2.charAt(j)){
        return dp[i][j] =1+solve(s1,s2,i+1,j+1,dp);
      }
      else{
        return dp[i][j]= 1+Math.min(solve(s1,s2,i+1,j,dp),solve(s1,s2,i,j+1,dp));
      }




    }




}