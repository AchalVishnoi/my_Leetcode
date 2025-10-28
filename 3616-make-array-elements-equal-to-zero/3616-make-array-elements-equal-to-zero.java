class Solution {
    public int countValidSelections(int[] nums) {
       int n=nums.length;
        if(n==1&&nums[0]==0)return 2;

        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }

        
        if(nums[n-1]==0) return (n)*2;
        int ans=0;
        if(nums[0]==0&&nums[n-1]==1) ans++;
        for(int i=1;i<n-1;i++){
            if(nums[i]==nums[i-1]){
                if(nums[i-1]==nums[n-1]-nums[i]) ans+=2;
                else if(Math.abs(nums[n-1]-2*nums[i])==1) ans++;
            }
        }

        if(nums[n-1]==nums[n-2]){
            if(nums[n-2]==1) ans++;
        }

        return ans;
        
    }
}