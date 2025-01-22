class Solution {
    public int firstMissingPositive(int[] a) {
        int n=a.length;

        int []m=new int[n+2];
        for(int i=0;i<n;i++){
           if(a[i]<0||a[i]>=n+1) continue;
           m[a[i]]++;
        }
        int ans=1;
        for(int i=1;i<=n+1;i++){
          if(m[i]==0) {
            ans=i;
            break;
          }
        }

        return ans;
    }
}