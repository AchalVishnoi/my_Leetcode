class Solution {
    public long rob(int[] nums, int[] col) {

        int n=nums.length;
        long dp[]=new long[n+1];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            if(col[i]==col[i-1]){
                long take= nums[i] + (i>=2?dp[i-2]:0);
                long not=dp[i-1];
                dp[i]=Math.max(take,not);
            }
            else dp[i]=dp[i-1]+nums[i];
        }

        return dp[n-1];
    }

    
}