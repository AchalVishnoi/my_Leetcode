class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();
        int t[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                t[i][j]=t[i-1][j-1]+1;
               }
               else{
                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
               }
           }
        }

        boolean b1[]=new boolean[n];
        boolean b2[]=new boolean[m];

        int i=n;
        int j=m;
        while(i>=1&&j>=1){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                b1[i-- -1]=true;
                b2[j-- -1]=true;
            }
            else{
                if(t[i-1][j]>=t[i][j-1]) i--;
                else j--;
            }
        }

        i=0;
        j=0;
        StringBuilder s=new StringBuilder();

        while(i<n||j<m){
            while(i<n&&!b1[i]) s.append(s1.charAt(i++));
            while(j<m&&!b2[j]) s.append(s2.charAt(j++));
            if(i<n&&j<m){
                s.append(s1.charAt(i));
                i++;
                j++;
            }
        }

        return s.toString();
        
    }
}