class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int a[]=new int [k];
        for(int i=0;i<n;i++)
        {
            if( arr[i]<0) a[(arr[i]%k+k)%k]++;
             else a[arr[i]%k]+=1;
        }

        if(a[0]%2!=0) return false;
        int i=1,j=k-1;
        while(j>i)
        {
        if(a[i]!=a[j])
        return false;
        i++;
        j--;
       
        }


        return true;


        
    }
}