class Solution {
    public int minKBitFlips(int[] nums, int k) {

        int n=nums.length;
        int flips[]=new int[n];
        int flip=0;
        int ans=0;
        for(int i=0;i<n;i++){

            if(i>=k) flip^=flips[i-k];

            if((nums[i]^flip)==0){

                if(i+k-1>=n) return -1;
                ans++;
                flips[i]=1;
                flip^=1;

            }

        }
      

      return ans;
        
    }
}