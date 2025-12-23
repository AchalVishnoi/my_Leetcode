class Solution {
    public int maxSizeSlices(int[] sl) {

        int n=sl.length;
        if(n==1) return sl[0];

        int k=n/3;

        return Math.max(find(sl,0,k),find(sl,1,k));

        
    }

    private int find(int sl[],int l,int k){

      int n=sl.length;

      int NEG = (int) -1e9;
     
      int dp[][]=new int[n+1][k+1];


      for(int i=n;i>=0;i--){
        for(int j=1;j<=Math.min(k,n-i);j++){    //j=1 coz j=0 will always be valid
            dp[i][j]=NEG;
        }
      }

      if(l==1){
        dp[n-1][1]=sl[n-1];
      }


      for(int i=n-2;i>=l;i--){

        for(int j=1;j<=Math.min(n-i,k);j++){
            dp[i][j]=Math.max(dp[i+1][j],dp[i+2][j-1]+sl[i]);
        }
      }

      return dp[l][k];






    }
}