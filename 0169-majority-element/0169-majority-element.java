class Solution {
    public int majorityElement(int[] nums) {

        int n=nums.length;

        int cnt=1;
        int con=nums[0];
        for(int i=1;i<n;i++){
            if(cnt==0) con=nums[i];
            if(nums[i]==con) cnt++;
            else cnt--;
        }

        return con;
        
    }
}