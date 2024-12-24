class Solution {
public int lengthOfLongestSubstring(String s) {
         int n=s.length();
         if(n==0) return 0;
        
         HashMap <Character,Integer> m=new HashMap<>();

         int ans=Integer.MIN_VALUE;
           int count=0;
           int left=0;
         for(int right=0;right<n;right++){
            if(m.containsKey(s.charAt(right))){
                left=Math.max (left,m.get(s.charAt(right))+1);
             

            } 
            
             m.put(s.charAt(right),right);
             ans=Math.max(right-left+1,ans);
            
         }
         return ans;

    }
}