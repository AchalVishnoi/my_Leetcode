class Solution {
    public int minFallingPathSum(int[][] mat) {

        int n=mat.length;

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int t=mat[i][j];
                mat[i][j]+=mat[i+1][j];
               if(j+1<n) mat[i][j]=Math.min(mat[i][j],t+mat[i+1][j+1]);
               if(j-1>=0) mat[i][j]=Math.min(mat[i][j],t+mat[i+1][j-1]);
            }
        } 

        int ans=mat[0][0];
        for(int x:mat[0]) ans=Math.min(ans,x);

        return ans;      
    }
}