class Solution {
    public int longestIncreasingPath(int[][] mat) {

        int ans=0;
        Integer dp[][]=new Integer[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[0].length;j++){
                ans=Math.max(solve(mat,i,j,dp),ans);
            }

        }

        return ans;
        
    }


    public int solve(int [][]a,int i,int j,Integer dp[][]){

        if(j>=a[0].length||i>=a.length||i<0||j<0) return 0;
        if(a[i][j]<0) return 0;
        if(dp[i][j]!=null) return dp[i][j];

        int ans=0;

        int t=a[i][j];

        if(j-1>=0&&a[i][j-1]>a[i][j]){

            

            a[i][j]=-1;

            ans=Math.max(ans,solve(a,i,j-1,dp));

            a[i][j]=t;
           
        }
        if(j+1<a[0].length&&a[i][j+1]>a[i][j]){

            a[i][j]=-1;

            ans=Math.max(ans,solve(a,i,j+1,dp));
            a[i][j]=t;
           
        }
        if(i-1>=0&&a[i-1][j]>a[i][j]){

           a[i][j]=-1;
            ans=Math.max(ans,solve(a,i-1,j,dp));

           a[i][j]=t;
           
        }
        if(i+1<a.length&&a[i+1][j]>a[i][j]){

            a[i][j]=-1;

            ans=Math.max(ans,solve(a,i+1,j,dp));
           
           a[i][j]=t;
        }

       
     


     return dp[i][j]=ans+1;   //+1 for cell itself

    }
}