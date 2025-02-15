class Solution {
    public int punishmentNumber(int n) {

        int ans = 0;
        for (int i = 1; i <= n; i++) {

            if (isValid((i * i), 0, i)) {
                ans += i * i;
            }

        }

        return ans;

    }

    public boolean isValid(int cur, int score, int n) {

        if (cur==0) {
           return n==score;
        }

        

      return isValid(cur/10,score+cur%10,n)||isValid(cur/100,score+cur%100,n)||isValid(cur/1000,score+cur%1000,n)||isValid(cur/10000,score+cur%10000,n);

    }
}

//by backtarcking

/*
class Solution {
    public int punishmentNumber(int n) {

        int ans = 0;
        for (int i = 1; i <= n; i++) {

            if (isValid(Integer.toString(i * i), 0, 0, i)) {
                ans += i * i;
            }

        }

        return ans;

    }

    public boolean isValid(String s, int i, int score, int n) {

        if (i >= s.length()) {
            if (score == n)
                return true;
            else
                return false;
        }

        

        for (int j = i + 1; j <= s.length(); j++) {
         int num = Integer.parseInt(s.substring(i, j));
            if (score + num > n) break; 
            
            if (isValid(s, j, score + num, n)) {
                return true; 
            }
        }

        return false;

    }
}*/