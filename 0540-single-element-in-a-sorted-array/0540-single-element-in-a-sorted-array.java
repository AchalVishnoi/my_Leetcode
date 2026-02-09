class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;

            if(mid%2==0){
              if(nums[mid+1]!=nums[mid]){
                j=mid;
              }
              else i=mid+1;
            }
            else{
              if(nums[mid-1]!=nums[mid]){
                j=mid;
              }
              else i=mid+1;
            }


        }


        return nums[j];
        
    }
}