class Solution {
    public String optimalDivision(int[] nums) {

       int n=nums.length;
       if(n==1) return String.valueOf(nums[0]);
       if(n==2) return String.valueOf(nums[0])+"/"+String.valueOf(nums[1]);

       StringBuilder s=new StringBuilder();
       s.append(nums[0]);
       s.append("/(");
       for(int i=1;i<n-1;i++){
         s.append(nums[i]);
         s.append("/");
       }

       s.append(nums[n-1]);
       s.append(")");

       return String.valueOf(s);
        
    }
}