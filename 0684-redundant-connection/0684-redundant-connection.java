class Solution {
    int par[];
    public int[] findRedundantConnection(int[][] edges) {
        par=new int[1000];
        for(int i=0;i<1000;i++) par[i]=i;
        int a[]=new int[2];
        for(int e[]:edges){
            if(union(e[0]-1,e[1]-1)) a=e;
        }
        return a;
    }
    private boolean union(int a,int b){
        int pa=find(a);
        int pb=find(b);
        if(pa==pb) return true;
        par[pb]=pa;
        return false;
    }
    private int find(int a){
        if(par[a]==a) return a;
        return par[a]=find(par[a]);
    }
}