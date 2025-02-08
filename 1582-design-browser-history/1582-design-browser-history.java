class list{
     String url;
     list next;
     list prev;
   
   public list(String url){
    this.url=url;
   }
}

class BrowserHistory {
    list brows;
    public BrowserHistory(String homepage) {
        brows=new list(homepage);
    }
    
    public void visit(String url) {
        list node=new list(url);
        brows.next=node;
        node.prev=brows;
        brows=brows.next;
    }
    
    public String back(int steps) {
        while(brows.prev!=null&&steps!=0){
        steps--;
        brows=brows.prev;
        }
        return brows.url;
    }
    
    public String forward(int steps) {
        while(brows.next!=null&&steps!=0){
        steps--;
        brows=brows.next;
        }
        return brows.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */