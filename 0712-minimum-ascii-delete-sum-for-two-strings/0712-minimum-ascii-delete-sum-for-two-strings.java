class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();       
        int t[][]=new int[n+1][m+1];
     
        for(int i=1;i<=n;i++){
            t[i][0]=t[i-1][0]+s1.charAt(i-1);

            for(int j=1;j<=m;j++){
                t[0][j]=t[0][j-1]+s2.charAt(j-1);
                if(s1.charAt(i-1)==s2.charAt(j-1)) t[i][j]=t[i-1][j-1];
                else{
                t[i][j]=t[i-1][j]+s1.charAt(i-1);
                t[i][j]=Math.min(t[i][j-1]+s2.charAt(j-1),t[i][j]);
                }

            }

        }

        return t[n][m];
 
    }
}