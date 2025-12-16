class Solution {
    public int scheduleCourse(int[][] cor) {

        Arrays.sort(cor,(a,b)->Integer.compare(a[1],b[1]));

        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());

        int curr=0;
        int ans=0;
        for(int q[]:cor){
            int dur=q[0],end=q[1];
           if(curr+dur<=end){
            curr+=dur;
            max.add(dur);
           }
           else if(!max.isEmpty()&&max.peek()>dur){
            curr-=max.poll();
            curr+=dur;
            max.add(dur);
           }
        }


        return max.size();
        
    }
}