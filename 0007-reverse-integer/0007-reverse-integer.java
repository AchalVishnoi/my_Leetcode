class Solution {
    public int reverse(int x) {

        if(x<10&&x>-10) return x;

        long ans=0;
        int sign=x/Math.abs(x);
        x=Math.abs(x);
        while(x>0){

            int k=x%10;
            x/=10;
            ans=ans*10+k;

           if(ans>Integer.MAX_VALUE) return 0;


        }

        return sign*(int)ans;
        
    }
}