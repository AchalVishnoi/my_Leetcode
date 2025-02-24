class Solution {
    public int[][] generateMatrix(int n) {
        int nums[][] = new int[n][n];
        Scanner sc =new Scanner(System.in);
        int topRow=0,bottomRow=n-1,rightCol=n-1,leftCol=0,totalNum=1;
        while (totalNum<=n*n) {
            for(int i=leftCol;i<=rightCol &&totalNum<=n*n;i++){
                nums[topRow][i]=totalNum;
                totalNum++;
            }
            topRow++;

            for(int j=topRow;j<=bottomRow  &&totalNum<=n*n;j++){
                    nums[j][rightCol]=totalNum;
                totalNum++;
                }
                rightCol--;

            for(int i=rightCol;i>=leftCol &&totalNum<=n*n;i--){
                        nums[bottomRow][i]=totalNum;
                        totalNum++;
                    }
                    bottomRow--;
            for(int i=bottomRow;i>=topRow &&totalNum<=n*n;i--){
                            nums[i][leftCol]=totalNum;
                            totalNum++;
                        }
                        leftCol++;
        }
        return nums;
        
    }
}