class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:nums1){
            h.put(x,-1);
        }

        Stack<Integer> s=new Stack<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=nums2[i])s.pop();
            if(!s.isEmpty()&&h.containsKey(nums2[i]))h.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=h.get(nums1[i]);
        }

        return nums1;
    }

}