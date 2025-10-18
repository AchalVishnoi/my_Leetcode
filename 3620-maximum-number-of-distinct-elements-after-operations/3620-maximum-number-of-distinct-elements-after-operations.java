class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        
        int next=Integer.MIN_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int i:nums){
            int t=Math.max(i-k,next);
            if(t<=i+k){
                ans++;
                next=t+1;
            }
        }

        return ans;
        
    }
}