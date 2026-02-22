class Solution {
    public int binaryGap(int n) {

        int ans=0;
        int st=0;
        while(n>0&&(n&1)==0) n>>=1;

        while(n>0){
            
            if((n&1)==0) st++;
            else {
                ans=Math.max(ans,st);
                st=1;
            }
            n>>=1;
        }

        return ans;
        
    }
}