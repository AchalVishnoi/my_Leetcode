class Solution {
    public int totalNQueens(int n) {
         char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        return solve(board, 0);
    }

    private int solve(char[][] board, int row) {
        int n = board.length;

     
        if (row == n) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                count += solve(board, row + 1); 
                board[row][col] = '.';
            }
        }

        return count;
    }

    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;

        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}