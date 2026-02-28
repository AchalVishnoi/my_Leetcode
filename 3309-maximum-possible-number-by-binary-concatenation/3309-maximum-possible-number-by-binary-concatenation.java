class Solution {
    int max=0;
    public int maxGoodNumber(int[] nums) {

        find(0,0,nums);
        return max;
        
    }

    public void find(int curr,int mask,int nums[]){

        if(mask>=7){
            max=Math.max(max,curr);
            return;
        }
      
       if((mask&1)==0){

        int size=32-Integer.numberOfLeadingZeros(nums[0]);
        find((curr<<size)+nums[0],mask|1,nums);

       }
       if((mask&2)==0){

        int size=32-Integer.numberOfLeadingZeros(nums[1]);
        find((curr<<size)+nums[1],mask|2,nums);

       }
       if((mask&4)==0){

        int size=32-Integer.numberOfLeadingZeros(nums[2]);
        find((curr<<size)+nums[2],mask|4,nums);

       }

    }
}