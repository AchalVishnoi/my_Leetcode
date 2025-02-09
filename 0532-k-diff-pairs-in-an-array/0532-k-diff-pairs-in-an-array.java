class Solution {
    public int findPairs(int[] nums, int k) {
        

        int n=nums.length;
        HashMap <Integer, Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        int ans=0;
    if (k == 0) {
          
            for (int count : m.values()) {
                if (count > 1) ans++;
            }
        } 
        else {
           
            for (int num : m.keySet()) {
                if (m.containsKey(num + k)) ans++;
            }
        }
     


return ans;

    }
}