class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int evcnt=0;
        int odcnt=0;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
            if(nums[i]%2==0) evcnt++;
            else odcnt++;

        }
        if(nums[n-1]%2==0) evcnt--;
        else return 0;
        if(nums[0]%2==0) evcnt++;
        else odcnt++;


        return evcnt+odcnt;




        
    }
}