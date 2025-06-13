import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        
        if (n <= 3) return 0;

        Arrays.sort(nums);

        // 4 options:
        // Change 3 largest: nums[n-4] - nums[0]
        // Change 2 largest + 1 smallest: nums[n-3] - nums[1]
        // Change 1 largest + 2 smallest: nums[n-2] - nums[2]
        // Change 3 smallest: nums[n-1] - nums[3]
        int ans = Math.min(nums[n - 4] - nums[0], 
                  Math.min(nums[n - 3] - nums[1], 
                  Math.min(nums[n - 2] - nums[2], 
                           nums[n - 1] - nums[3])));

        return ans;
    }
}
