class Solution {
    int ans=0;
    Map<Integer,List<Integer>> adj;
    public int countGoodNodes(int[][] edges) {

        adj=new HashMap<>();
        for(int x[]:edges){
            adj.putIfAbsent(x[0], new ArrayList<>());
            adj.putIfAbsent(x[1], new ArrayList<>());

            adj.get(x[0]).add(x[1]);
            adj.get(x[1]).add(x[0]); 
        }

        dfs(0,-1);
        return ans;


        
    }
    private int dfs(int u,int par){

       if(!adj.containsKey(u)){
        ans++;
        return 1;
       } 

       int a=-1;
       boolean isGood=true;
       int size=0;

        for(int v:adj.get(u)){
            if(v==par) continue;   
            int k=dfs(v,u);
            if(a==-1) a=k;
            else if(isGood && a!=-1 && a!=k){
                isGood=false;
            }

         size+=k;
        }

        if(isGood) ans++;

        return size+1;

    }
}