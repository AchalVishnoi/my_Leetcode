class Solution {
    public boolean isZeroArray(int[] nums, int[][] qu) {

        int n=nums.length;
        
        int []diff=new int[n+1];
        for(int i=0;i<qu.length;i++){
            diff[qu[i][0]]+=1;
            diff[qu[i][1]+1]-=1;
        }
        if(diff[0]<nums[0]) return false;
        for(int i=1;i<n;i++){
            diff[i]+=diff[i-1];
            if(diff[i]<nums[i]) return false;
       }

       return true;
    }
}