class Solution {
    public int countTriplets(int[] arr) {
     int n=arr.length;
        
        for(int i=1;i<n;i++){
           arr[i]^=arr[i-1];
        }

        int ans=0;
         
          for(int k=1;k<n;k++){
                if(arr[k]==0) ans+=k ;
              }

              

        
        for(int i=0;i<n-1;i++){
            for(int k=i+1;k<n;k++){
  
             if((arr[i]^arr[k])==0) ans+=k-i-1;     //excluding i coz the proffered i will be i+1
             
                }
        }





      return ans;  
    }
}