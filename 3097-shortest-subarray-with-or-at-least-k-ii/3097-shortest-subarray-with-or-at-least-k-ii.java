class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int n=nums.length;

        int bit[]=new int[32];
        int i=0;
        int curr=0;
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            curr=incBit(bit,nums[j]);

            while(i<=j&&curr>=k){
              ans=Math.min(j-i+1,ans);
              curr=decBit(bit,nums[i]);
              i++;
            }

        }

        return ans==Integer.MAX_VALUE?-1:ans;
        
    }



    private int decBit(int bit[],int num){
      int n=0;  
      for(int i=0;i<32;i++){
        if((num&(1<<i))!=0) bit[i]--;
        if(bit[i]>0) n|=(1<<i);
      }
      return n;
    }
    private int incBit(int bit[],int num){
      int n=0;
      for(int i=0;i<32;i++){
        if((num&(1<<i))!=0) bit[i]++;
        if(bit[i]>0) n|=(1<<i);
      }
      return n;
    }
}