class Solution {
    static final int MOD = 1_000_000_007;
    public int numSubseq(int[] nums, int tar) {
        int n=nums.length;
        Arrays.sort(nums);
        long[] pow2 = new long[n];

        pow2[0] = 1;

        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        long ans=0;
        for(int i=0;i<n;i++){
            int idx=findIdx(nums,tar,i);
            if(idx<i) break;
            ans=(ans+pow2[idx-i])%MOD;
        }
        return (int)ans;
        
    }

    private int findIdx(int nums[],int tar,int idx){
        int n=nums.length;
        int i=idx;
        int j=n-1;
        int max=idx-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[idx]+nums[mid]>tar) j=mid-1;
            else{
                max=mid;
                i=mid+1;
            }
        }

        return max;
    }
}