class Solution {
    int ans[];
    int i=0;
    Stack<Integer> s=new Stack<>();
    
    public int[] findOrder(int n, int[][] pre) {
        ans=new int[n];

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
            if(!find(adj,vis,recvis,i)) return new int[]{};
            
        }

        while(!s.isEmpty()){
          ans[i++]=s.pop();
        }

        return ans;

        
    }

    public boolean find(Map<Integer,List<Integer>> adj,boolean []vis,boolean[] recvis,int u){
        
        if(recvis[u]) return false;
        if(vis[u]) return true;
        
        vis[u]=true;
        
        recvis[u]=true;

        if(adj.containsKey(u)){
         for(int v:adj.get(u)){
            if(!find(adj,vis,recvis,v)) return false;
         }
        }
        

        recvis[u]=false;
        s.add(u);

        return true;

    }
}