class Solution {
    public int maxProduct(int[] nums) {

        int n=nums.length;

        int pref = 1, suff = 1;

        int res=Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            pref=(pref==0?1:pref)*nums[i];
            suff=(suff==0?1:suff)*nums[n-1-i];

            res=Math.max(res,Math.max(pref,suff));
        }



        return res;



   
    }
}