class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=Math.min(0,nums[0]);

        int res=max;

        for(int i=1;i<n;i++){
            int x=nums[i];
            max+=x;
            res=Math.max(x,res);
            res=Math.max(max,res);
            res=Math.max(max-min,res);

            min=Math.min(max,min);



        }


       return res;
        

    }
}