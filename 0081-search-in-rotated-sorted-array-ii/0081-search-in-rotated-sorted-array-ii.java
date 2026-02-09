class Solution {
    public boolean search(int[] nums, int t) {

        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j&&nums[i]==nums[i+1]) i++;
        while(i<j&&nums[j]==nums[j-1]) j--;

        while(j>=i){
            int mid=i+(j-i)/2;
            if(nums[mid]==t||nums[i]==t||nums[j]==t) return true;

            if(nums[mid]>nums[j]){
                if(t<nums[mid]&&t>nums[i]){
                    j=mid-1;
                }
                else i=mid+1;
            }
            else{

                if(t<nums[j]&&t>nums[mid]) i=mid+1;
                else j=mid-1;
                
            }

        }

        return false;
        
    }
}