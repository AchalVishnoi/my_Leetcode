class Solution {
    public int[] twoSum(int[] nums, int t) {
     /*   int n=nums.length;
        
      for (int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
          if(nums[i]+nums[j]==target)
         {
            return new int[] {i,j};
          } 
           }
     }


    return  new int[] {};
*/

    HashMap<Integer,Integer> m=new HashMap<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        int c=t-nums[i];
        if(m.containsKey(c)){
            return new int[]{m.get(c), i};
        }
        else{
            m.put(nums[i],i);
        }
    }

    

    return  new int[] {};





    }
}