class Solution {
    public int wiggleMaxLength(int[] nums) {


        int n=nums.length;
        int pos[]=new int[n];
        int neg[]=new int[n];

        pos[0]=1;
        neg[0]=1;

        int ans=1;

        for(int i=1;i<n;i++){
            pos[i]=1;
            neg[i]=1;
            for(int j=i-1;j>=0;j--){
               if(nums[i]==nums[j]) continue;
               
               if(nums[i]>nums[j]){
                pos[i]=Math.max(pos[i],neg[j]+1);
               }
               else{
                neg[i]=Math.max(neg[i],pos[j]+1);
               }
            }

            ans=Math.max(pos[i],ans);
            ans=Math.max(neg[i],ans);
        }

        return ans;


        
    }
}