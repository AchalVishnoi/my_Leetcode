class Solution {
    public int countOdds(int l, int h) {

        int n=h-l+1;
        if((h&l&1)==0){
            return n/2;
        }
        else return n/2+1;

        
    }
}