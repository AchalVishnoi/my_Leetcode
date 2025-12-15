class Solution {
    public long countSubarrays(int[] nums, long k) {

        int n=nums.length;
        long ans=0;
        long curr=0;
        int i=0;
        for(int j=0;j<n;j++){
            curr+=nums[j];

            while(i<=j&&curr*(j-i+1)>=k){
                curr-=nums[i];
                i++;
            }

            ans+=(j-i+1);
        }

        return ans;
        
    }
}