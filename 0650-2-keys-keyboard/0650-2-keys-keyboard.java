class Solution {
    public int minSteps(int n) {

        if(n==1) return 0;

        Long dp[][]=new Long[n+1][n+1];

        return (int)find(1,1,n,dp)+1;



        
    }

    public long find(int c,int len,int n,Long dp[][]){

      if(len==n) return 0;
      if(len>n||c+len>n) return Integer.MAX_VALUE;
      if(dp[len][c]!=null) return dp[len][c];

      
      dp[c][len]=Math.min(find(c,len+c,n,dp),find(len,len*2,n,dp)+1)+1;
      return dp[c][len];


    }
}