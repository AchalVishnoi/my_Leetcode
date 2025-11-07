class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(board, 0, result);
        return result;

    }

    public void solve(char board[][], int row, List<List<String>> ans) {

        if (row >= board.length) {

            ans.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < board[0].length; col++) {

            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row + 1, ans);
                board[row][col] = '.';
            }

        }

    }

    private List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }

    private boolean isValid(char board[][], int row, int col) {
        // for left diagonel
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // for right diagonal
        for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;

        }

        // upper side
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q'||board[row][i]=='Q')
                return false;

        }

        return true;
    }
}