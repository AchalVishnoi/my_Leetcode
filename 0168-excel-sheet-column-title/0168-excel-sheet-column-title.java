class Solution {
    public String convertToTitle(int col) {
        StringBuilder ans = new StringBuilder();
        
        while (col > 0) {
            col--; 
            char ch = (char) ('A' + (col % 26));
            ans.append(ch);
            col /= 26;
        }
        
        return ans.reverse().toString(); 
    }
}