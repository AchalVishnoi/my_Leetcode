class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int mask = 0, j = 0;

        for (int i = 0; i < n; i++) {
            while ((mask & nums[i]) != 0) {  
                mask ^= nums[j]; 
                j++;
            }

            mask |= nums[i];
            ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}
