class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int curr=0;
        for(int i=0;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }

        curr=0;
        for(int i=0;i<n;i++){
            curr=Math.min(nums[i],curr+nums[i]);
            min=Math.min(min,curr);
        }

    return Math.max(Math.abs(min),Math.abs(max));
        
    }
}