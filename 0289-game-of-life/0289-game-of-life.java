class Solution {
    public void gameOfLife(int[][] b) {

        int n=b.length;
        int m=b[0].length;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                
                    int cnt=0;
                    if(i>0&&(b[i-1][j]==1||b[i-1][j]==-2)) cnt++;
                    if(j>0&&(b[i][j-1]==1||b[i][j-1]==-2)) cnt++;
                    if(i<n-1&&(b[i+1][j]==1||b[i+1][j]==-2)) cnt++;
                    if(j<m-1&&(b[i][j+1]==1||b[i][j+1]==-2)) cnt++;
                    if(i>0&&j>0&&(b[i-1][j-1]==1||b[i-1][j-1]==-2)) cnt++;
                    if(j>0&&i<n-1&&(b[i+1][j-1]==1||b[i+1][j-1]==-2)) cnt++;
                    if(i<n-1&&j<m-1&&(b[i+1][j+1]==1||b[i+1][j+1]==-2)) cnt++;
                    if(i>0&&j<m-1&&(b[i-1][j+1]==1||b[i-1][j+1]==-2)) cnt++;

                    if(cnt==3&&b[i][j]==0) b[i][j]=+2;
                
                    else if(b[i][j]==1&&(cnt<2||cnt>3)) b[i][j]=-2;
                
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j]==+2) b[i][j]=1;
                if(b[i][j]==-2) b[i][j]=0;
            }
        }
        
    }
}