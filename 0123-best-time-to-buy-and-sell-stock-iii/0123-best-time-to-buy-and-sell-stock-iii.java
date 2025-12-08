class Solution {
    public int maxProfit(int[] p) {

        int n=p.length;
        int b1=-p[0];
        int s1=0;
        int b2=-p[0];
        int s2=0;
        for(int i=1;i<n;i++){
            b1=Math.max(b1,-p[i]);
            s1=Math.max(s1,b1+p[i]);
        
            b2=Math.max(b2,s1-p[i]);
            s2=Math.max(s2,b2+p[i]);
        }

      return s2;

     
    }
}