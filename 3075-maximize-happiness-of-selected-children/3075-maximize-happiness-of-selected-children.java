class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        
        int n=h.length;
        Arrays.sort(h);
        int cnt=0;
        long ans=0;
        for(int i=n-1;i>=0;i--){
           if(cnt==k||h[i]-cnt<=0) break;
           ans+=h[i]-cnt++;
        }

        return ans;
    }
}