class Solution {
    public int maxSubArray(int[] nums) {

        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            curr+=x;
            max=Math.max(curr,max);
            if(curr<0) curr=0;

        }

        return max;
        
    }
}