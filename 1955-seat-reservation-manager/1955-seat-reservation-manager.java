class SeatManager {
    private PriorityQueue<Integer> mh;
    public SeatManager(int n) {
       mh=new PriorityQueue<>();
       for(int i=1;i<=n;i++){
        mh.add(i);
       }
    }
    
    public int reserve() {
     return mh.poll();

    }
    
    public void unreserve(int seatNumber) {
       mh.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */