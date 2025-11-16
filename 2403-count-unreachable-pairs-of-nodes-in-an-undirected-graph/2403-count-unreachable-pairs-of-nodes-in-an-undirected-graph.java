class Solution {
    int par[];
    public long countPairs(int n, int[][] edges) {
        par=new int[n];
        for(int i=0;i<n;i++) par[i]=i;
        for(int e[]:edges) union(e[0],e[1]);
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int p=find(i);
            h.put(p,h.getOrDefault(p,0)+1);
        }

        long rem=n;
        long ans=0;

        for(Map.Entry<Integer,Integer> m:h.entrySet()){
           ans+=m.getValue()*(rem-m.getValue());
           rem-=m.getValue();
        }

        return ans;
        
    }
    public void union(int a,int b){
        int pa=find(a);
        int pb=find(b);
        par[pb]=pa;
    }
    public int find(int a){
        if(par[a]==a) return a;
        return par[a]=find(par[a]);
    }
}