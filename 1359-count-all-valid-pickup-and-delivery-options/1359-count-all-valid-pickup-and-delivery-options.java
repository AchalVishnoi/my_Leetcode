class Solution {
    int mod=(int)(1e9+7);
    public int countOrders(int n) {

     long ans=1;
     for(int i=1;i<=n;i++){
        ans=(ans*i%mod)%mod;
        ans=(ans*(2L*i-1L)%mod)%mod;
     }

     return (int)ans; 
        
    }

    public static long factorial(int n) {
        if(n==0||n==1) {
            return 1;
        }
        long fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static long combination(int n, int r) {
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
}