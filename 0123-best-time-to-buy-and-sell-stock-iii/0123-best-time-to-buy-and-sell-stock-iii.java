class Solution {
    public int maxProfit(int[] p) {

        int n=p.length;

        int sdp[][]=new int[n+1][3];
        int bdp[][]=new int[n+1][3];

        for (int j=1;j<=2;j++) {
            bdp[0][j]=-p[0];
        }
        
        for(int i=1;i<n;i++){
            
            for(int j=1;j<=2;j++){
              sdp[i][j]=Math.max(sdp[i-1][j],bdp[i-1][j]+p[i]);
              bdp[i][j]=Math.max(bdp[i-1][j],sdp[i-1][j-1]-p[i]);
            }
        }

        int ans=0;
        for(int i=1;i<=2;i++){
            ans=Math.max(sdp[n-1][i],ans);
        }
        
        return ans;
     
    }
}