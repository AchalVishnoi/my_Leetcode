class Solution {
    public int[] constructArray(int n, int k) {

        int a[]=new int[n];
        int max=n;
        int min=2;
        a[0]=1;
        int i=1;
        while(i<k){
           if(a[i-1]==min-1) a[i]=max--;
           else a[i]=min++;
           i++;
        }

        if(a[i-1]==min-1){
            while(i<n) a[i++]=min++;   
        }
        else while(i<n) a[i++]=max--;

        return a;

        
    }
    
}