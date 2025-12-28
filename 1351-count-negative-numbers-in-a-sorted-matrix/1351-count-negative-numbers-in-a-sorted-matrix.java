class Solution {
    public int countNegatives(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int ans=0;
        int i=n-1,j=0;

        while(i>=0&&j<m){
            int idx=findIdx(g[i],j,m-1);
            if(idx==-1) break;
            ans+=(m-idx);
            j=idx;
            i--;
        }

        return ans;



    }

    public int findIdx(int a[],int i,int j){
        int idx=-1;
        while(i<=j){
            int m=(i+j)/2;

           if(a[m]<0){
            idx=m;
            j=m-1;
           }
           else{
            i=m+1;
           }
        }

        return idx;
    }
}