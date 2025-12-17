class Solution {
    public int minimumBeautifulSubstrings(String s) {

        int n=s.length();
        int dp[]=new int[n+1];

        Arrays.fill(dp,n+2);
        dp[n]=0;

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0') continue;
            

            int x=0;
            for(int j=i;j<n;j++){
               x<<=1;
               x|=(s.charAt(j)-'0');
               if(isPow(x)) dp[i]=Math.min(dp[i],dp[j+1]+1);

            }
        }

        return dp[0]==n+2?-1:dp[0];
        
    }
    private boolean isPow(int x){
        while(x>1){
            if(x%5!=0) return false;
            x/=5;
        }

        if(x==1)return true;
        return false;
        
    }
}