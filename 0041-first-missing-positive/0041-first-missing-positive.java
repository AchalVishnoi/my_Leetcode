class Solution {
    public int firstMissingPositive(int[] nums) {

        int n=nums.length;

        for (int i=0;i<n;i++) {
            if (nums[i]<=0||nums[i]>n) {
                nums[i]=n+1;
            }
        }
        
        for(int i=0;i<n;i++){
            int a=Math.abs(nums[i]);
            if(a>=1&&a<=n){
                nums[a-1]=-Math.abs(nums[a-1]);
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }

        return n+1;
        
    }
}