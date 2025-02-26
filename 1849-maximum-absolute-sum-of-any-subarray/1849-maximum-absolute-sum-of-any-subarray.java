class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int n=nums.length;
        //for max subarray sum

        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(maxsum,currsum);
        }

        currsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<n;i++){
            currsum=Math.min(nums[i],currsum+nums[i]);
            minsum=Math.min(minsum,currsum);
        }

     return Math.max(Math.abs(maxsum),Math.abs(minsum));




    }
}