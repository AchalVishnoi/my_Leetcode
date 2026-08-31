class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(mid%2!=0){
                mid--;
            }
            if(mid+1<n&&nums[mid]==nums[mid+1]){
                i=mid+2;
            }
            else{
                j=mid;
            }
        }

        return nums[j];
    }
}