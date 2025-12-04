class Solution {
    public int findLongestChain(int[][] p) {
        int n=p.length;

        Arrays.sort(p,(x,y)->Integer.compare(x[0],y[0]));

        int dp[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(p[j][1]<p[i][0]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    ans=Math.max(ans,dp[i]);
                }
            }
        }

        return ans+1;
        
    }
}