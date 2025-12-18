class Solution {
    public int minSteps(int n) {

        if(n==1) return 0;

        //int dp[][]=new int[n+1][n+1];

        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=0;

        for(int i=2;i<=n;i++){
           dp[i]=i;
           for(int j=2;j*2<=i;j++){
              if(i%j==0){
                dp[i]=Math.min(dp[i],dp[j]+i/j);
              }
           }
        }

        return dp[n];

        
    }

    public long find(int c,int len,int n,Long dp[][]){

      if(len==n) return 0;
      if(len>n||c+len>n) return Integer.MAX_VALUE;
      if(dp[len][c]!=null) return dp[len][c];

      
      dp[c][len]=Math.min(find(c,len+c,n,dp),find(len,len*2,n,dp)+1)+1;
      return dp[c][len];


    }
}