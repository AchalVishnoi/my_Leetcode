class Solution {

   int sum=0;

    public int subsetXORSum(int[] nums) {
        find(nums,0,0);
        return sum;
    }

    private void find(int nums[],int i,int xor){
        if(i>=nums.length) {
            sum+=xor;
            return;
        }

        find(nums,i+1,xor);
        find(nums,i+1,xor^nums[i]);
        
        
            }
}