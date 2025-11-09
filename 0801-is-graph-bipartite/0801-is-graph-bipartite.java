class Solution {
    public boolean isBipartite(int[][] graph) {

        int n=graph.length;


        int color[]=new int [n];
        
        boolean ans=true;

        for(int i=0;i<n;i++){
            if(color[i]!=0) continue;
            ans&=dfs(graph,color,i,1);

        }

        return ans;

        
    }

    public boolean dfs(int [][] gr,int color[],int u,int curr){

        if(color[u]!=0) return true;

        color[u]=curr;

        boolean b=true;

        for(int v:gr[u]){
            if(color[v]==curr) return false;
            if(color[v]==0){
              b&=dfs(gr,color,v,-curr);
            }
        }

     return b;

    }
}