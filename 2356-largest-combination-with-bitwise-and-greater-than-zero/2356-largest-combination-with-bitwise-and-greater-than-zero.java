class Solution {
    public int largestCombination(int[] c) {

     int n=c.length;

    int ans=-1;
        for(int i=0;i<24;i++){
       int siz=0;
       for(int j=0;j<n;j++){
       
       if(((c[j]>>i)&1)==1) siz++;


       }

      ans=Math.max(ans,siz);

        }
        

        return ans;
    }
}