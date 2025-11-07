class Solution {
    public int findCircleNum(int[][] isC) {

        int n=isC.length;
        int cnt=0;

        Map<Integer,List<Integer> > adj=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(isC[i][j]==1){
                List<Integer> l=adj.getOrDefault(i,new ArrayList<>());
                l.add(j);
                adj.put(i,l);
                }

            }
        }

        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,adj);
                cnt++;
            }
        }



     return cnt;
        
    }

    public void dfs(int i,boolean[] vis,Map<Integer,List<Integer>> adj){
        if(vis[i]) return;
        vis[i]=true;

        if(!adj.containsKey(i)) return;

        for(int j:adj.get(i)){
            dfs(j,vis,adj);
        }
    }
}