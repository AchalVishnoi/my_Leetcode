class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];

        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
     }

     public int rob(int[] nums,int st, int end) {

       int n=end-st+1;
       int t[]=new int[n+1];
       t[0]=0;
       t[1]=nums[st];
       for(int i=2;i<n+1;i++){
        int skip=t[i-1];
        int steal=t[i-2]+nums[st+i-1];
        t[i]=Math.max(skip,steal);
       }

       return t[n];
        
    }

}