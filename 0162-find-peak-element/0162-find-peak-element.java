class Solution {
    public int findPeakElement(int[] nums) {
        return find(nums);
    }

    private int find(int nums[]){
        int n=nums.length;

        int i=0,j=n-1;
        while(i<j){

            int mid=i+(j-i)/2;
            int a=nums[mid];
            int b=nums[mid+1];
            if(a<=b) i=mid+1;
            else j=mid;

        }

        return j;

    }
}