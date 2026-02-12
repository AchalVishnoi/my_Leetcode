class Solution {
    public int longestBalanced(String s) {


        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int fr[]=new int[26];
            int max=0;
            for(int j=i;j<n;j++){
              char c=s.charAt(j);
              fr[c-'a']++;
              int cn=0;
              boolean fl=true;
              for(int k=0;k<26;k++){
                    if (fr[k]>0) {
                        if (cn==0)cn=fr[k]; 
                        else if(fr[k]!=cn) {
                            fl=false;
                            break;
                        }
                    }
              }

              if(fl) ans=Math.max(ans,j-i+1);
            }
        }

        return ans;
        
    }
}