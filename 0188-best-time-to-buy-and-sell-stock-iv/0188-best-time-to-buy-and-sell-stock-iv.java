class Solution {
    public int maxProfit(int k, int[] p) {

        int n=p.length;

        int sdp[][]=new int[n+1][k+1];
        int bdp[][]=new int[n+1][k+1];

        for (int j=1;j<=k;j++) {
            bdp[0][j]=-p[0];
        }
        
        for(int i=1;i<n;i++){
            
            for(int j=1;j<=k;j++){
              sdp[i][j]=Math.max(sdp[i-1][j],bdp[i-1][j]+p[i]);
              bdp[i][j]=Math.max(bdp[i-1][j],sdp[i-1][j-1]-p[i]);
            }
        }

        int ans=0;
        for(int i=1;i<=k;i++){
            ans=Math.max(sdp[n-1][i],ans);
        }
        
        return ans;
    }
}