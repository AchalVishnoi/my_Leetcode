class Solution {
    public int maxTurbulenceSize(int[] arr) {


     int n=arr.length;

     if(n==2){
        if(arr[0]==arr[1]) return 1;
        else return 2;
     } 

     int curr=1;

     
     
     int j=0;
     
     for(int i=2;i<n;i++ ){
        if((arr[i-1]<arr[i-2]&&arr[i]>arr[i-1])
        ||(arr[i-1]>arr[i-2]&&arr[i]<arr[i-1]))
        {
          curr=Math.max(i-j+1,curr);  
          continue;
        }

        else j=i-1;

        if(arr[i-1]!=arr[i-2]||arr[i]!=arr[i-1]) curr=Math.max(2,curr);
     } 


     return curr;

    }
}