class Solution {
    public long countBadPairs(int[] nums) {
      
       int n=nums.length;
       HashMap <Integer,Integer> m=new HashMap<>();
       
       long good=0;
       long total=((long)n*(n-1))/2;
       for(int i=0;i<n;i++){
        int key=nums[i]-i;
        int q=m.getOrDefault(key,0);
        good+=q;
        m.put(key,q+1);

               }

    return total-good;




    }
}