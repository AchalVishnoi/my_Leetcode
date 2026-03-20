class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {

        int n=grid.length;
        int m=grid[0].length;
        int ans[][]=new int[n-k+1][m-k+1];

        int a[]=new int[k*k];

        for(int i=0;i<n-k+1;i++){
            for(int j=0;j<m-k+1;j++){
              
              int p=0;

              ans[i][j]=Integer.MAX_VALUE;

              for(int ig=i;ig<i+k;ig++){
                for(int jg=j;jg<j+k;jg++){
                    a[p]=grid[ig][jg];
                    p++;
                }
              }

              Arrays.sort(a);
              for(int x=0;x<k*k-1;x++){

                if(a[x+1]-a[x]==0) continue;
                ans[i][j]=Math.min(ans[i][j],a[x+1]-a[x]);
                

              }

              if(ans[i][j]==Integer.MAX_VALUE) ans[i][j]=0;
                

            }
        }

        return ans;
        
    }
}