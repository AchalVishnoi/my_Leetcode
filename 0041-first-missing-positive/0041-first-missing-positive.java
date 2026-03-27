class Solution {
    public int firstMissingPositive(int[] nums) {

        int n=nums.length;
        boolean m[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0&&nums[i]<=n){
                m[nums[i]-1]=true;
            }
        }

        for(int i=0;i<n;i++){
            if(!m[i]) return i+1;
        }

        return n+1;
        
    }
}