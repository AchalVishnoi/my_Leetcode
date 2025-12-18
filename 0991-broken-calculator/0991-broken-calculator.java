class Solution {
    public int brokenCalc(int st, int t) {

        
        int x=st;
        int op=0;
        while(t>x){
            if(t%2!=0) t++;
            else t/=2;
            op++;
        }

        op+=x-t;
        return op;


        
    }
}