class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        int max=arr[0];
        int min=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }

        if ((max-min)% (n - 1) != 0) return false;
        int d=(max-min)/(n-1);
        

        for(int i=0;i<n;i++){
            int j=i;
            while(arr[i]!=min+i*d){
                if(d==0) return false;
                if((arr[i]-min)%d!=0) return false;
                j=(arr[i]-min)/d;
                if(j>=n||j<0||(arr[i]==arr[j]&&j!=i)) return false;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        return true;
        
    }
}