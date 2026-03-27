class Solution {
    int par[];
    int rank[];
    public long countPairs(int n, int[][] edges) {
        par=new int[n];
        for(int i=0;i<n;i++) par[i]=i;
        rank=new int[n];
        Arrays.fill(rank,1);

        for(int e[]:edges){
            union(e[0],e[1]);
        }

        long ans=0;
        int rem=n;

        for(int i=0;i<n;i++){
            if(rank[i]==0) continue;
            rem-=rank[i];
            ans+=(long) rank[i]*rem;
           
        }

        return ans;

    }

    private void union(int a,int b){
       int pa=find(a);
       int pb=find(b);
       if (pa == pb) return; 
       par[pb]=pa;
       
       rank[pa]+=rank[pb];
       rank[pb]=0;
    }

    private int find(int a){
        if(par[a]==a) return a;
        return par[a]=find(par[a]);
    }
}