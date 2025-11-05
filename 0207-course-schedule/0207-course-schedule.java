class Solution {
    public boolean canFinish(int n, int[][] pre) {

        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int []p:pre){
            List <Integer> l=adj.getOrDefault(p[1],new ArrayList<>());
            l.add(p[0]);
            adj.put(p[1],l);
        }
        boolean vis[]=new boolean[n];
        boolean recvis[]=new boolean[n];
        
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            if(!find(adj,vis,recvis,i)) return false;
            
        }

        return true;

        
    }

    public boolean find(Map<Integer,List<Integer>> adj,boolean []vis,boolean[] recvis,int u){

        
        if(recvis[u]) return false;
        if(vis[u]) return true;
        
        vis[u]=true;
        if(adj.get(u)==null) return true;
        recvis[u]=true;
        
        for(int v:adj.get(u)){
           if(!find(adj,vis,recvis,v)) return false;
        }
        recvis[u]=false;

        return true;

    }
}