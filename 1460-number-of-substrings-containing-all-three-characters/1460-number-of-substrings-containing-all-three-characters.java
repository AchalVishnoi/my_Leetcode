class Solution {
    public int numberOfSubstrings(String s) {


        int n=s.length();

        int a[]=new int[3];
        int cnt=0;
        int ans=0;


        int j=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)-'a'<3){
                a[s.charAt(i)-'a']++;
                if(a[s.charAt(i)-'a']==1) cnt++;

            }

            while(cnt==3){
                ans+=(n-i);
                if(s.charAt(j)-'a'<3){
                a[s.charAt(j)-'a']--;
                if(a[s.charAt(j)-'a']==0) cnt--;

            }
                j++;
            }




        }


        return ans; 
        
    }
}