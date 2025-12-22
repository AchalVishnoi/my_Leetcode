class Solution {
    int t[][];
    public int minInsertions(String s) {
        if(isPalin(s)) return 0;
        int n=s.length();
        t=new int[n+1][n+1];

        for(int i=0;i<n;i++) t[i][i]=1;

        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)) t[i][j]=t[i+1][j-1]+2;
                else t[i][j]=Math.max(t[i+1][j],t[i][j-1]);
            }
        }

        
        return n-t[0][n-1];
        
    }

   public boolean isPalin(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j)
    if(s.charAt(i++)!=s.charAt(j--)) 
    return false;

    return true;
   }







}