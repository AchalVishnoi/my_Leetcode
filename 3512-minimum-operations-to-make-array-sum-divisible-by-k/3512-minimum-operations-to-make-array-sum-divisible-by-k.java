class Solution {
    public int minOperations(int[] nums, int k) {

        int sm=0;
        for(int x:nums) sm+=x;
        return sm%k;
        
    }
}