class Solution {
    int mod=1000000000+7;
    public int numOfSubarrays(int[] arr) {


      int n=arr.length;
      int even=0;
      int odd=0;
      if(arr[0]%2==0) even++;
      else odd++;
      for(int i=1;i<n;i++){
           arr[i]+=arr[i-1];
           if(arr[i]%2==0) even++;
           else odd++;
      }

      int ans=(int)((odd+(long)odd*even)%mod);


     return ans;
        
    }
}