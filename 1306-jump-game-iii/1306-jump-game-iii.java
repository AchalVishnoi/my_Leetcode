class Solution {
    boolean vis[];;
    public boolean canReach(int[] arr, int start) {

        int n=arr.length;
        vis=new boolean[n];

        return find(arr,start);
        
    }
    private boolean find(int a[],int i){
        int n=a.length;
        if(i>=n||i<0) return false;
        if(a[i]==0) return true;
        if(vis[i]) return false;

        vis[i]=true;

        return find(a,i+a[i])|find(a,i-a[i]);

    }
}