class Solution {

 public boolean checkValidGrid(int[][] grid) {
        return check(grid, 0,0,0);
    }


    public boolean check(int [][] gr, int i, int j,int cnt){
    if(cnt>=gr.length*gr[0].length) return true;
    if(i<0||i>=gr.length||j<0||j>=gr[0].length||gr[i][j]!= cnt) return false;
    


    boolean ans=false;
    ans=check(gr,i+2,j+1,cnt+1)||
    check(gr,i+2,j-1,cnt+1)||
    check(gr,i-2,j+1,cnt+1)||
    check(gr,i-2,j-1,cnt+1)||
    check(gr,i+1,j+2,cnt+1)||
    check(gr,i+1,j-2,cnt+1)||
    check(gr,i-1,j+2,cnt+1)||
    check(gr,i-1,j-2,cnt+1);


   return ans;
    }
}   