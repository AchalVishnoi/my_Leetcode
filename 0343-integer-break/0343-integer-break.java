class Solution {
    public int integerBreak(int n) {

        int t[]=new int[n+1];
        t[1]=1;
        t[2]=1;

        for(int i=3;i<=n;i++){
            t[i]=i-1;
          for(int j=2;j<i;j++){
            t[i]=Math.max(t[i],
            Math.max(t[j],j)*Math.max(t[i-j],i-j));
          }

        }

        return t[n];
        
    }
}