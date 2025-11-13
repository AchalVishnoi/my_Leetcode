class Solution {
    public int maxOperations(String s) {

        int n=s.length();
        int ans=0;
        int prev=0;
        boolean fl=false;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                fl=true;
            }
            else{
                ans+=prev;               
                if(fl){
                    ans++;
                    prev++;
                }

                fl=false;
            }
        }

        return ans;
        
    }
}