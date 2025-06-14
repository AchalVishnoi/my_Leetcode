class Solution {
    public int calculateMinimumHP(int[][] grid) {
        return find(grid,new Integer[grid.length][grid[0].length],0,0)+1;
    }
    public int find(int [][] grid,Integer dp[][],int i, int j){
      
       if(i>=grid.length||j>=grid[0].length) return Integer.MAX_VALUE;
       if(i==grid.length-1&&j==grid[0].length-1) return Math.max(0,-grid[i][j]);

       if(dp[i][j]!=null) return dp[i][j]; 

        int ans= find(grid,dp,i+1,j);
        ans=     Math.min(ans,find(grid,dp,i,j+1));
        



      return dp[i][j]=Math.max(ans-grid[i][j],0);
    }
}