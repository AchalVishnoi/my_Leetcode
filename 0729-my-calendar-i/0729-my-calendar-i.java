class MyCalendar {

    Slot root;


    public MyCalendar() {}
    
    public boolean book(int st, int end) {

        if(root==null){
            root=new Slot(st,end);
            return true;
        }
        return insert(root,st,end);

        
    }

    private boolean insert(Slot node,int st,int end){
        if(node.end<=st){
            if(node.right==null){
                node.right=new Slot(st,end);
                return true;
            }
            return insert(node.right,st,end);
        }
        if(node.start>=end){
            if(node.left==null){
                node.left=new Slot(st,end);
                return true;
            }
            return insert(node.left,st,end);
        }

        return false;
    }
}
class Slot {
    int start;
    int end;
    Slot left;
    Slot right;

    public Slot(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */