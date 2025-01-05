class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int sti=-1,stj=-1;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==1) {
                sti=i;
                stj=j;
               }
               if(grid[i][j]==0) count++;
            }
        }

        return path(grid, sti,stj,count+1);    //count +1  coz we are also counting 1 as free cell



    }

    public int path(int [][]grid, int i,int j, int count){
       int n=grid.length;
        int m=grid[0].length;
        if(i<0||i>=n||j<0||j>=m||grid[i][j]==-1) return 0;

         if(grid[i][j]==2&&count==0) return 1;
         if(grid[i][j]==2||count==0) return 0;
         
         int temp=grid[i][j];
         grid[i][j]=-1;
         count--;
         int result=path(grid, i+1,j,count)+path(grid, i,j+1,count)+path(grid, i-1,j,count)+path(grid, i,j-1,count);
         grid[i][j]=temp;
         count++;
        
         return result;



    }
}