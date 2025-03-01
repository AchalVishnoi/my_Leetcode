class Solution {
    public int[] applyOperations(int[] nums) {
        
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            nums[i]*=2;
            nums[i+1]=0;
        }
       }

       for(int i=nums.length-2;i>=0;i--){

         if(nums[i]==0){
            int j=i+1;
            while(j<nums.length&&nums[j]!=0){
                nums[j-1]=nums[j];
                j++;
            }
            nums[j-1]=0;


         }


       }


       return nums;
    }
}