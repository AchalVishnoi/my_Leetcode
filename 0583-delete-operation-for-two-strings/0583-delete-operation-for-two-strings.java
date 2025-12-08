class Solution {
    public int minDistance(String w1, String w2) {

        int n=w1.length();
        int m=w2.length();
        int t[][]=new int[n+1][m+1];
     
        for(int i=1;i<=n;i++){

            for(int j=1;j<=m;j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)) t[i][j]=t[i-1][j-1]+1;
                t[i][j]=Math.max(t[i-1][j],t[i][j]);
                t[i][j]=Math.max(t[i-1][j-1],t[i][j]);
                t[i][j]=Math.max(t[i][j-1],t[i][j]);
            }

        }

        return n+m-2*t[n][m];
        
    }
}