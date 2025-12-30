class Solution {
    public int findCenter(int[][] e) {

       int a=e[0][0];
       int b=e[0][1];

       if(e[1][0]==a||e[1][1]==a) return a;
       return b;
        
    }
}