class Solution {
    Long dp[][];
    public long minCost(int m, int n, int[][] waitCost) {

        dp=new Long[m][n];

        return 1+find(0,0,waitCost,1);
        
    }
    private long find(int i,int j,int[][]wc,int sec){

        int n=wc.length;
        int m=wc[0].length;

        if(i==n-1&&j==m-1) return 0;
        if(i>=n||j>=m) return Long.MAX_VALUE;

        if(dp[i][j]!=null) return dp[i][j];

        if(sec%2==0){
            return dp[i][j]=wc[i][j]+find(i,j,wc,sec+1);
        }
        else{

            long ans=Long.MAX_VALUE;
            if(i+1<n){
                ans=Math.min(ans,(i+2)*(j+1)+find(i+1,j,wc,sec+1));
            }

            if(j+1<m){
                ans=Math.min(ans,(i+1)*(j+2)+find(i,j+1,wc,sec+1));
            }

            return dp[i][j]=ans;

        }
    }
}