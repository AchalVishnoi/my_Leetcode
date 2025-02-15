class Solution {
    public int uniquePathsWithObstacles(int[][] obst) {
          
          int m=obst.length;
          int n=obst[0].length;
           int dp[][]=new int [m+1][n+1];

           for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
           }
        return solve(0,0,n,m,dp,obst);
        
    }

    public int solve(int i,int j,int n,int m,int dp[][],int [][]obst){

      if(i>=m||j>=n||obst[i][j]==1){
        return 0;
      }
      if(i==m-1&&j==n-1) return 1;

      if(dp[i][j]!=-1) return dp[i][j];

      int ans=solve(i+1,j,n,m,dp,obst);
      ans+=solve(i,j+1,n,m,dp,obst);


      return dp[i][j]=ans;




    }
}