class Solution {
    public long getDescentPeriods(int[] prices) {

        int n=prices.length;
        long ans=1;
        int z=1;
        for(int i=1;i<n;i++){


         if(prices[i-1]==prices[i]+1) z++;
         else z=1;
         ans+=z;
        

        }
        
        return ans;
    }
}