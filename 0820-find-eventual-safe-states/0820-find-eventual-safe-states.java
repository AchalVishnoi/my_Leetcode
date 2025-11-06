class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n=graph.length;
        Map<Integer,List<Integer>> adj=new HashMap<>();
        int in[]=new int[n];
        int j=0;
        for(int num[]:graph){
            for(int i:num){
               List<Integer> l=adj.getOrDefault(i,new ArrayList<>());
               l.add(j);
               adj.put(i,l);
            }
            j++;
        }

        for(List<Integer> l:adj.values()){
            for(int i:l){
                in[i]++;
            }

        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(in[i]==0){
                q.add(i);
            }
        }

        List<Integer> ans=new ArrayList<>();

        boolean safe[]=new boolean[n];

        while(!q.isEmpty()){
            int u=q.poll(); 
            List<Integer> l=adj.get(u);
            safe[u]=true;

           if(l!=null){
            for(int i:l){
                in[i]--;
                if(in[i]==0) q.add(i);
            }
           }



        }


        for(int i=0;i<n;i++){
            if(safe[i]) ans.add(i);
        }


     return ans;
        
    }
}