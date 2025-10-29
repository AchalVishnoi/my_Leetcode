class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] lc, int[] rc) {

        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<n;i++){
           if(h.containsKey(lc[i])||h.containsKey(rc[i])) return false;
           if(lc[i]!=-1) h.put(lc[i],i);
           
           if(rc[i]!=-1) h.put(rc[i],i);
        }

        if(h.size()!=n-1) return false;

        int root=-1;
        for(int i=0;i<n;i++){
            if(!h.containsKey(i)){
                if(root!=-1) return false;
                root=i;
            }
        }

        boolean vis[]=new boolean[n];
        if(!dfs(root,vis,lc,rc)) return false;

        for(int i=0;i<n;i++) if(!vis[i]) return false;



        return true;

        
    }

    public boolean dfs(int node,boolean vis[],int []lc,int []rc){
        if(node==-1) return true;
        if(vis[node]) return false;

        vis[node]=true;
        return dfs(lc[node],vis,lc,rc)&&dfs(rc[node],vis,lc,rc);
    }
}