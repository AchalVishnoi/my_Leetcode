class Solution {
    public int[] getMaximumXor(int[] n, int maxBit) {

        int maxk=(1<<maxBit)-1;
        int m=n.length;
        for(int i=1;i<m;i++){
            n[i]^=n[i-1];
        }
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=(maxk^n[m-i-1]);
        }
       return ans; 
    }
}