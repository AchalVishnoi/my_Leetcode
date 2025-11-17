class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int n=nums.length;

        int j=-1;
        for(int i=0;i<n;i++){
           if(nums[i]==1){
            if(j!=-1&&i-j-1<k) return false;
            j=i;
           }
        }

        return true;
        
    }
}