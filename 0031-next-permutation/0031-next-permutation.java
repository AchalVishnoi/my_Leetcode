import java.util.Arrays;

class Solution {
   /* public void nextPermutation(int[] a) {
        int n = a.length;
        int i=n-2;
        while(i>=0&&a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            Arrays.sort(a,i+1,n);
            {
            int j=i+1;
            while(j<n&&a[i]>=a[j]){
                j++;
            }
            swap(a,i,j);
           }
           

        }
        else{
            Arrays.sort(a);
        }
        
     

    }*/

    //using reverse

    public void nextPermutation(int[] a) {
        int n = a.length;
        int i=n-2;
        while(i>=0&&a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            
            {
            int j=n-1;
            while(j<n&&a[i]>=a[j]){
                j--;
            }
            swap(a,i,j);
           }
           

        }
        reverse(a,i+1,n-1);
        
     

    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] =a[j];
        a[j] = temp;
    }

    private void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }


}
