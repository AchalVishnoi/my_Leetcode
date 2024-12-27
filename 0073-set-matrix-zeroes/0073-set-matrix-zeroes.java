class Solution {
    public void setZeroes(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int r1Has0 = 0;
        int c1Has0 = 0;

        for (int j = 0; j < n; j++) {
            if (a[0][j] == 0) {
                r1Has0 = 1;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (a[i][0] == 0) {
                c1Has0 = 1;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = 0; 
                    a[0][j] = 0; 
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][0] == 0 || a[0][j] == 0) {
                    a[i][j] = 0;
                }
            }
        }

        if (r1Has0 == 1) {
            for (int j = 0; j < n; j++) {
                a[0][j] = 0;
            }
        }

        if (c1Has0 == 1) {
            for (int i = 0; i < m; i++) {
                a[i][0] = 0;
            }
        }
    }
}
