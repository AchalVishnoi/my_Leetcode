class Solution {
    public int searchInsert(int[] a, int t) {

        int ans=0;
        int n=a.length;
    int i=0;
    int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==t)
            return mid;

            if(a[mid]>t){
                j=mid-1;
            }
            else{
                i=mid+1;
            }


        }

       
        return i;
        
    }
}