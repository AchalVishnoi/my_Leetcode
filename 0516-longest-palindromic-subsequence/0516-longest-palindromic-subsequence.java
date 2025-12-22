class Solution {
    public int longestPalindromeSubseq(String s) {

        int n=s.length();
        int [][]t=new int[n][n];

        for(int i=0;i<n;i++) t[i][i]=1;

        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)) t[i][j]=t[i+1][j-1]+2;
                else t[i][j]=Math.max(t[i+1][j],t[i][j-1]);
            }
        }

        
        return t[0][n-1];
        
    }
    public int solve(String s,int i,int j,Integer t[][]){

        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(t[i][j]!=null) return t[i][j];




       int n=0;  
       if(s.charAt(i)==s.charAt(j)){

        n=2+solve(s,i+1,j-1,t);
           
       }
       else{
        n=Math.max(solve(s,i+1,j,t),solve(s,i,j-1,t));
       }



       return t[i][j]=n;



    }






}