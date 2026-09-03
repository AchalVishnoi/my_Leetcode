class Solution {
    public int[] findRightInterval(int[][] inter) {
        int n=inter.length;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=inter[i][0];
            a[i][1]=i;
        }

        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            int idx=findIdx(inter[i][1],a);
            ans[i]=idx;
        }
        return ans;
    }
    private int findIdx(int end,int a[][]){
        int i=0;
        int j=a.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(a[mid][0]>=end){
                idx=a[mid][1];
                j=mid-1;
            }
            else i=mid+1;
        }

        return idx;

    }
}