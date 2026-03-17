class Solution {
    public int change(int amt, int[] c) {

        int n=c.length;
        int dp[][]=new int[amt+1][n+1];
        for(int i=0;i<=n;i++){
            dp[amt][i]=1;
        }

        for(int a=amt;a>=0;a--){
            for(int i=n-1;i>=0;i--){
                int take=0;
                if(a+c[i]<=amt){
                    take=dp[a+c[i]][i];
                }
                int skip=dp[a][i+1];
                dp[a][i]=take+skip;
            }
        }

        return dp[0][0];
        
    }
}