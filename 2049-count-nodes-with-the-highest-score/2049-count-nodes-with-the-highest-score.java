class Solution {

    int [] siz;
    List<Integer>[] adj;
    public int countHighestScoreNodes(int[] par) {
        int n=par.length;
        siz=new int[n];
        adj=new ArrayList[n];
        long q[]=new long[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=1;i<n;i++){
            adj[par[i]].add(i);
        }

        findSize(0);



        Arrays.fill(q,1);
        long max=q[0];
        for(int i=1;i<n;i++){
           q[i]*=(siz[0]-siz[i]);
           q[par[i]]*=siz[i]; 
           max=Math.max(q[i],max);
           max=Math.max(q[par[i]],max);
        }

        int cnt=0;

        for(int i=0;i<n;i++){
            if(q[i]==max) cnt++;
        }

        return cnt;


        
    }

    public int findSize(int u){

       siz[u]++;
       for(int v:adj[u]){
         siz[u]+=findSize(v);
       }

       return siz[u];


    }


}