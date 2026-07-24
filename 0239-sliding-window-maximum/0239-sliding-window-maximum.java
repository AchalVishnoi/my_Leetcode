class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int z=0;
        int j=0;

        int ans[]=new int[n-k+1];

        for(int i=0;i<n;i++){

            while(!dq.isEmpty()&&nums[dq.getLast()]<=nums[i]) dq.pollLast();
            dq.addLast(i);
            z++;
            if(z==k){
                ans[j++]=nums[dq.getFirst()];
                z--;
                if(i-k+1==dq.getFirst()) dq.pollFirst();
            }

        }

        return ans;
        
    }
}