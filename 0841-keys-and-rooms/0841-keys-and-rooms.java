class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n=rooms.size();
        boolean vis[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
           List<Integer> l=rooms.get(q.poll());
           for(int x:l){
            if(vis[x]) continue;
            vis[x]=true;
            q.add(x);
           } 
        }

        for(boolean b:vis) if(!b) return false;
        return true;
        
    }
}