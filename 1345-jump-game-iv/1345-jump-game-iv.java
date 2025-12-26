class Solution {
    HashMap<Integer,List<Integer>> h;
    public int minJumps(int[] arr) {

        h=new HashMap<>();

        int n=arr.length;

        for(int i=0;i<n;i++){
            List<Integer> l=h.getOrDefault(arr[i],new ArrayList<>());
            l.add(i);
            h.put(arr[i],l);
            
        }

        boolean vis[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        int ans=0; 
        while(!q.isEmpty()){
          int s=q.size();
          
        for(int i=0;i<s;i++){
            int k=q.poll();
            
            if(k==n-1) return ans;
            if(k-1>=0&&!vis[k-1]){
              q.add(k-1);
              vis[k-1]=true;
            }
            if(k+1<n&&!vis[k+1]){
              q.add(k+1);
              vis[k+1]=true;
            }
            if (h.containsKey(arr[k])) {
                for (int x : h.get(arr[k])) {
                    if (!vis[x]) {
                        vis[x] = true;
                        q.add(x);
                    }
                }
                h.remove(arr[k]);
            }
        }

          ans++;
        }


        return ans;
        
    }
}