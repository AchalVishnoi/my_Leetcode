class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        int x=0;
        int n=nums.length;
        List<Boolean> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            x<<=1;           
           x|=nums[i];
           x%=5;
           if(x==0) l.add(true);
           else l.add(false);

        }

        return l;
        
    }
}