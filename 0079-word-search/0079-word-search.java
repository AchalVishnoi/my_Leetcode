class Solution {
    public boolean exist(char[][] board, String word) {

        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(find(board,i,j,0,word)) return true;
                
            }
        }

        return false;
        
    }

    boolean find(char[][]b,int i,int j,int idx,String word){
         int n=b.length;
        int m=b[0].length;
        if(idx>=word.length() ) return true;
        if(i<0||i>=n||j<0||j>=m||b[i][j]!=word.charAt(idx)) return false;

        char temp=b[i][j];
        b[i][j]='0';
   boolean result=find(b,i+1,j,idx+1,word)||find(b,i,j+1,idx+1,word)||find(b,i-1,j,idx+1,word)||find(b,i,j-1,idx+1,word);
    b[i][j]=temp;


    return result;


    }

}