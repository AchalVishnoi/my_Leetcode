class Solution {
    public boolean canJump(int[] nums) {

        int n=nums.length;

        boolean b[]=new boolean[n];
        b[n-1]=true;
        for(int i=n-2;i>=0;i--){
            for(int j=i;j<=Math.min(n-1,i+nums[i]);j++){
                b[i]|=b[j];
            }
        }

        return b[0];
        
    }
}