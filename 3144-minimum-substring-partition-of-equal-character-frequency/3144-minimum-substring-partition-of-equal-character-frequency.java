class Solution {
    public int minimumSubstringsInPartition(String s) {

        int n=s.length();
        int dp[]=new int[n+1];

        for(int i=n-1;i>=0;i--){
           dp[i]=dp[i+1]+1;

           for(int j=i;j<n;j++){
             if(isBal(s,i,j)){
                dp[i]=Math.min(dp[i],dp[j+1]+1);
             }
            }
        }

        return dp[0];
        
    }

    private boolean isBal(String s,int i,int j){
        HashMap<Character,Integer> freq=new HashMap<>();
        for(;i<=j;i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        int n=freq.get(s.charAt(j));

        for(Integer k:freq.values()){
            if(k!=n) return false;
        }

        return true;
    }
}