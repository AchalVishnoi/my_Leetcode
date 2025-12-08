class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int b[]=new int[n+1];
        int s[]=new int[n+1];
        b[0]=-p[0];
        
        s[0]=0;
        if(n>=2){
           b[1]= Math.max(-p[1],b[0]);
           s[1]=Math.max(0,b[0]+p[1]);           
        }

        for(int i=2;i<n;i++){
          b[i]=Math.max(s[i-2]-p[i],b[i-1]);
          s[i]=Math.max(b[i-1]+p[i],s[i-1]);
        }

        return Math.max(b[n-1],s[n-1]);

  
    }
}