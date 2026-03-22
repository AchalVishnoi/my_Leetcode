class Solution {
    public boolean findRotation(int[][] mat, int[][] tar) {
        int n=mat.length;  
        boolean b1=true,b2=true,b3=true,b4=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=tar[i][j]) b1=false;
                if(mat[n-j-1][i]!=tar[i][j]) b2=false;
                if(mat[n-i-1][n-j-1]!=tar[i][j]) b3=false;
                if(mat[j][n-i-1]!=tar[i][j]) b4=false;
                if(!(b1||b2||b3||b4)) return false;
            }

            
        }

        return b1||b2||b3||b4;
        
    }
}