class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
              int c=(int)Math.sqrt(i*i+j*j);
              if(c*c==i*i+j*j&&c<=n) ans+=2;
            }
        }

        return ans;
        
    }
}