class Solution {
    public int minFallingPathSum(int[][] mat) {

        int n=mat.length;




        
        for(int i=n-2;i>=0;i--){

            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            int idx=0;
            for(int j=0;j<n;j++){
                if(mat[i+1][j]<min1){
                    min2=min1;
                    min1=mat[i+1][j];
                    idx=j;
                }
                else if(mat[i+1][j]<min2) min2=mat[i+1][j];
            }

            for(int j=0;j<n;j++){
                if(idx!=j) mat[i][j]+=min1;
                else mat[i][j]+=min2;
            }


        }



        int ans=mat[0][0];
        for(int x:mat[0]) ans=Math.min(ans,x);

        return ans; 
    }  
}