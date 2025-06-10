class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        if(nums.length<3) return 0;

        int n=nums.length;

        int j=0;
        int ans=0;
        int currDiff=nums[1]-nums[0];

        for(int i=1;i<n;i++){
           
           if(nums[i]-nums[i-1]==currDiff){
            if(i-j+1>=3) ans+=(i-j+1-3+ 1);
           }
           else {
             j=i-1;
             if(i==n-1) break;
             currDiff=nums[i]-nums[i-1];
           }
           
          


        }

        return ans;
        
    }
}