class Solution {
    public int maxProfit(int[] p) {

        int n=p.length;
        int b[]=new int[n+1];
        int s[]=new int[n+1];
        b[0]=-p[0];
        s[0]=0;
        for(int i=1;i<n;i++){
          b[i]=Math.max(s[i-1]-p[i],b[i-1]);
          s[i]=Math.max(b[i-1]+p[i],s[i-1]);
        }

        return Math.max(b[n-1],s[n-1]);




        
        
    }
}