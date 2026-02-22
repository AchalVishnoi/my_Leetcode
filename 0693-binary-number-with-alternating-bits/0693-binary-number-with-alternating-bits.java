class Solution {
    public boolean hasAlternatingBits(int n) {

        int k=n&1; 
        while(n>0){
          int a=n&1;
          if((a^k)==1) return false;
          k = 1^k;
          n>>=1;
        }

        return true;
        
    }
}