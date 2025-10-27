class Solution {
    public int numberOfBeams(String[] bank) {

        int n=bank.length;
        int prev=0;
        int ans=0;
        for(String s:bank){
           int cnt=0;
           for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1') cnt++;
           }
           ans+=(cnt*prev);
           if(cnt!=0) prev=cnt;
        }

        return ans;
        
    }
}