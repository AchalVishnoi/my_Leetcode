class Solution {

    private boolean checkSeparation(int[][] intervals, int k) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int individual = 1;
        int reach = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= reach) {
                individual++;
                reach = intervals[i][1];
            } else {
                reach = Math.max(reach, intervals[i][1]);
            }
        }
        return individual >= k;
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        int m = rectangles.length;
        int[][] vertical = new int[m][2];
        int[][] horizontal = new int[m][2];

        for (int i = 0; i < m; i++) {
            horizontal[i][0] = rectangles[i][0];
            horizontal[i][1] = rectangles[i][2];

            vertical[i][0] = rectangles[i][1];
            vertical[i][1] = rectangles[i][3];
        }

        return checkSeparation(vertical, 3) || checkSeparation(horizontal, 3);
    }
}