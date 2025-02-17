import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] b) {
        Set<String> s = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (b[i][j] != '.') {
                    String num = String.valueOf(b[i][j]);

                    if (s.contains(num + " in row " + i) ||
                        s.contains(num + " in col " + j) ||
                        s.contains(num + " in box " + (i / 3) + "-" + (j / 3))) {
                        return false;
                    }

                    s.add(num + " in row " + i);
                    s.add(num + " in col " + j);
                    s.add(num + " in box " + (i / 3) + "-" + (j / 3));
                }
            }
        }

        return true;
    }
}
