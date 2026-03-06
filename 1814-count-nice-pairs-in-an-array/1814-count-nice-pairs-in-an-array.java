class Solution {
    long mod=(int)1e9+7;
    public int countNicePairs(int[] nums) {
        
        int n=nums.length;

        for(int i=0;i<n;i++){
            nums[i]=nums[i]-rev(nums[i]);
        }

        Arrays.sort(nums);

        long ans=0;

        for(int i=0;i<n;i++){
          int cnt=1;
          while(i<n-1&&nums[i]==nums[i+1]){
            i++;
            ans=(ans+cnt%mod)%mod;
            cnt++;
          }
        }


        return (int)ans;
        

    }
    private int rev(int x){
        int r=0;

        while(x>0){
            r=r*10+x%10;
            x/=10;
        }

        return r;
    }
    private long modPow(long x,long m){
       if(m==0) return 1; 
       long a=1;
       while(m>0){
            if((m&1)==1){
                a=(a*x)%mod;
                m--;
            }

            x=(x*x)%mod;
            m>>=1;
       }

       return a;
    }
}