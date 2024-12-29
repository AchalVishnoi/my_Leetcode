class Solution {
    public boolean searchMatrix(int[][] a, int target) {

  


        
return findT(a,target);
        
    }

    public static int findRow(int [][]a,int t){
  int m = a.length;
        int i = 0;
        int j = m - 1; 

        int rowNumber = -1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (t >= a[mid][0]) {
                if (mid == m - 1 || a[mid + 1][0] > t) {
                    rowNumber = mid;
                    break;
                }
                 else {
                    i = mid + 1;
                }
            } 
            else {
                j = mid - 1; 
            }
        }


        return rowNumber;

    }


    public boolean findT(int a[][],int t){
    int n = a[0].length;
        int i = 0;
        int j = n - 1;
      int rowNumber=findRow(a,t);

      if(rowNumber==-1) return false;


        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[rowNumber][mid] == t) {
                return true;
            } else if (a[rowNumber][mid] > t) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }

    }
