class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {

        int k=0;
        int i=0;
        int j=0;
         int mid[]=new int[2];
         if((a.length+b.length)%2==0){
           mid[0]=(a.length+b.length)/2-1;
           mid[1]=(a.length+b.length)/2;
         }
         else{
            mid[0]=(a.length+b.length)/2;
            mid[1]=(a.length+b.length)/2;
         }
         
        double ans=0;
        
          int curr=0;
          int fl=0;
          while(i<a.length&&j<b.length){
             
             if(a[i]<=b[j]) curr=a[i++];
             else curr=b[j++];
             if(k==mid[0]){
                ans+=curr;
             }
             if(k==mid[1]){
                ans+=curr;
                fl=1;
                return ans/2;
             }
             k++;

          }

          if(fl==0){
            while(i<a.length){

                curr=a[i++];
                if(k==mid[0]){
                ans+=curr;
             }
             if(k==mid[1]){
                ans+=curr;
               
                return ans/2;
             }
             k++;

            }

            while(j<b.length){

                curr=b[j++];
                if(k==mid[0]){
                ans+=curr;
             }
             if(k==mid[1]){
                ans+=curr;
               
                return ans/2;
             }
             k++;

            }
          }

          




      return 0.0;

        
    }
}