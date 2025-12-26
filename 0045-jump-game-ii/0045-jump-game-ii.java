class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int currMax=0;
        int curr=0;
        int ans=0;
        for(int i=0;i<n-1;i++){

            currMax=Math.max(currMax,i+nums[i]);
            if(i==curr){
                ans++;
                curr=currMax;
            }

        }

        return ans;
        
    }
}