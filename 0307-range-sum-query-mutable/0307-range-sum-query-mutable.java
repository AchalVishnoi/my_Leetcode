class NumArray {

    int seg[];
    int n;

    public NumArray(int[] nums) {

        n=nums.length;
        seg=new int[4*n];

        populate(nums,0,0,n-1);

        
    }
    
    public void update(int index, int val) {

        update(val,0,0,n-1,index);
        
    }
    
    public int sumRange(int left, int right) {
        return find(0,left,right,0,n-1);
    }

    private void populate(int nums[],int i,int l,int r){

        if(l==r){
            seg[i]=nums[l];
            return;
        }

        if(r<l) return;

        int mid=l+(r-l)/2;

        populate(nums,2*i+1,l,mid);
        populate(nums,2*i+2,mid+1,r);

        seg[i]=seg[2*i+1]+seg[2*i+2];
    }

    private void update(int val,int i,int l,int r,int idx){
        if(idx<l||idx>r) return;
        if(l==r){
            seg[i]=val;
            return;
        }
        int mid=l+(r-l)/2;
        update(val,2*i+1,l,mid,idx);
        update(val,2*i+2,mid+1,r,idx);
        seg[i]=seg[2*i+1]+seg[2*i+2];
    }

    private int find(int i,int st,int end,int l,int r){

        if(l>end||r<st) return 0;
        if(st<=l&&end>=r) return seg[i];

        int mid=l+(r-l)/2;

        return find(2*i+1,st,end,l,mid)+find(2*i+2,st,end,mid+1,r);
        
    }


}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */