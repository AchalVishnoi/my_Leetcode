class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        int curr=0;
        int ans=0;
        int j=0;

        for(int i=0;i<n;i++){

            if(!hm.containsKey(nums[i])){
               curr+=nums[i];
               hm.put(nums[i],i);
            }
            else{

                int t=hm.get(nums[i]);
                while(j<n&&j<=t){

                    hm.remove(nums[j]);

                    curr-=nums[j];

                    j++;

                }
                curr+=nums[i];
                hm.put(nums[i],i);
              
                


            }
              ans=Math.max(curr,ans);



        }


        return ans;
        
    }
}