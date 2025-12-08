class Solution {
    
    public int minDistance(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();       
        int[][]dp=new int[n+1][m+1];

        for(int i=0;i<n;i++){
            dp[i][m]=n-i;
        }
        for(int i=0;i<m;i++){
            dp[n][i]=m-i;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(w1.charAt(i)==w2.charAt(j)) dp[i][j]=dp[i+1][j+1];
                else{
                    dp[i][j]=dp[i+1][j+1];
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j]);
                    dp[i][j]=Math.min(dp[i][j+1],dp[i][j]);
                    dp[i][j]++;
                }
            }
        }

        return dp[0][0];

        
    }

}