class Solution {
    public int[] findOrder(int n, int[][] p) {
        ArrayList<Integer> a[]=new ArrayList[n];
        int it[]=new int[n];
        int st=-1;

        for(int i=0;i<p.length;i++){
            if(a[p[i][1]]==null) a[p[i][1]]=new ArrayList<>();
            List<Integer> l1=a[p[i][1]];
            
            l1.add(p[i][0]);
            it[p[i][0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int j=0;
        
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(it[i]==0){
                q.add(i);
            }
        }
        int cnt=0;
        while(!q.isEmpty()){
            int u=q.poll();

            ans[j++]=u;
            cnt++;
            if(a[u]==null)continue;
            for(int v:a[u]){
                it[v]--;
                if(it[v]==0) q.add(v);
            }
            
        }

        if(cnt<n) return new  int[]{};
        return ans;
        
    }
}