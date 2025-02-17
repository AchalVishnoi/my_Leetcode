class Solution {

    int solved = 0; // Flag to stop recursion when solved

    public void solve(char board[][], int row, int col) {

        if (row == 9) { // Sudoku solved
            solved = 1;
            return;
        }

        if (board[row][col] != '.') {
            if (col != 8)
                solve(board, row, col + 1);
            else
                solve(board, row + 1, 0);
        } else {
            for (int num = 1; num <= 9; num++) {
                if (isValid(board, row, col, num)) {
                    board[row][col] = (char) ('0' + num);

                    if (col != 8)
                        solve(board, row, col + 1);
                    else
                        solve(board, row + 1, 0);

                    if (solved == 1)
                        return; // Stop further recursion

                    board[row][col] = '.'; // Backtrack
                }
            }
        }
    }

    public boolean isValid(char[][] board, int row, int col, int num) {
        char digit = (char) ('0' + num);

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit)
                return false;
        }

        int startRow = (row / 3) * 3, startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit)
                    return false;
            }
        }

        return true; // Number is valid
    }

    public void solveSudoku(char board[][]) {
        solve(board, 0, 0);
        solved = 0; // Reset flag for next call
    }
}
