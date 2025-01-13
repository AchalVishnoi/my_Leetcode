class Solution {
    public int singleNumber(int[] nums) {
        
      
      int ans=0;
    

      for(int bit=0;bit<=31;bit++){
      int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&(1<<bit))==(1<<bit)) count++;

        }

        if(count%3==1) ans+=(1<<bit);
       



      }




return ans;
    }
}