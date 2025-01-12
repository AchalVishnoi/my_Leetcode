class Solution {
    public boolean isPowerOfFour(int n) {
       
       if(n==4||n==1) return true;

        if((n&(n-1))==0&&n>0){

            int bits=0;
           int i=0;

            while((n&(1<<i))==0){
                 i++;
            }
            if(i%2==0) return true;
        }


return false;

    }
}