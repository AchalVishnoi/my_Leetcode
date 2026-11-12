class Solution {
    public int minimumTotal(List<List<Integer>> tr) {

        int n=tr.size();
        int dp[]=new int[n];

        for(int i=0;i<n;i++){
            dp[i]=tr.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--){
            List<Integer> a= tr.get(i);
            for(int j=0;j<=i;j++){
                dp[j]=Math.min(dp[j]+a.get(j),dp[j+1]+a.get(j));
            }
        }

        return dp[0];
        
    }
}