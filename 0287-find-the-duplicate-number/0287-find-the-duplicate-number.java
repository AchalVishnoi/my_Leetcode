class Solution {
    public int findDuplicate(int[] a) {
        int n=a.length;
int ans=0;
       for(int i=0;i<n;i++){
         if(a[Math.abs(a[i])]<0) {
            ans=Math.abs(a[i]) ;
            break;
         }
         a[Math.abs(a[i])]*=-1;



       }

       return ans;
     

    }
}