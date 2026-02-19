class Solution {
    public int countBinarySubstrings(String s) {

        int n=s.length();
        int ans=0;
        int prev=0;
        int curr=0;
        int i=0;
        while(i<n){
            int j=i;
            while(j+1<n&&s.charAt(j+1)==s.charAt(j)) j++;
            curr=j-i+1;
            ans+=Math.min(prev,curr);
            prev=curr;
            i=j+1;
        }

        return ans;


        
    }
}