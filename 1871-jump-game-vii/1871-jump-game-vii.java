class Solution {
    public boolean canReach(String s, int min, int max) {

        int n=s.length();
        if(s.charAt(n-1)=='1') return false;
        boolean dp[]=new boolean[n];
        dp[0]=true; 
        int cnt=0;
        for(int i=1;i<n;i++){

            if(i-min>=0&&dp[i-min]) cnt++;
            if(i-max-1>=0&&dp[i-max-1]) cnt--;

            if(cnt>0&&s.charAt(i)=='0') dp[i]=true;
            
        }




        return dp[n-1];
        
    }
}