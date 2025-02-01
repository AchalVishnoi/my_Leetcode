class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] que) {


        int volidx[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if((nums[i]&1)==(nums[i-1]&1)) volidx[i]++;
            volidx[i]+=volidx[i-1];
        }
         
         boolean ans[]=new boolean[que.length];
         for(int i=0;i<que.length;i++){
            
            if(volidx[que[i][0]]==volidx[que[i][1]]) ans[i]=true;
            else ans[i]=false;
         }


        

return ans;


    }
}