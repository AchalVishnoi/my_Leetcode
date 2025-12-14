class Solution {
    public int wiggleMaxLength(int[] nums) {


        int n=nums.length;

        int up=1,down=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) up=Math.max(down+1,up);
            if(nums[i]<nums[i-1]) down=Math.max(up+1,down);
        }

        return Math.max(up,down);


        
    }
}