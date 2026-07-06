class Solution {
    public int search(int[] nums, int tar) {

        return find(nums,tar);
        
    }

    private int find(int nums[],int tar){
        int n=nums.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int a=nums[st];
            int b=nums[mid];
            int c=nums[end];
            if(b==tar) return mid;
            if(a<=b){
                if(tar>=a&&tar<b) end=mid-1;
                else st=mid+1;
            }
            else{
                if(tar>b&&tar<=c) st=mid+1;
                else end=mid-1;  
            }
        }


        return -1;

        
    }
}