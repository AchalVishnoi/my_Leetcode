class Solution {
    int par[];
    public int makeConnected(int n, int[][] con) {

        if(con.length<n-1) return -1;

        par=new int[n];
        for(int i=0;i<n;i++) par[i]=i;

        for(int a[]:con){
            union(a[0],a[1]);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i==par[i]) cnt++;
        }

        return cnt-1;
        
    }

    private void union(int a,int b){
       int pa=find(a);
       int pb=find(b);
       par[pb]=pa;
    }

    private int find(int a){
        if(par[a]==a) return a;
        return par[a]=find(par[a]);
    }
}