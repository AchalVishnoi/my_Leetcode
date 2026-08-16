class Solution {
    public int minKBitFlips(int[] nums, int k) {

        int n=nums.length;

        int ans=0;

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(q.size()%2==0){
                    if(i+k-1>=n) return -1;
                    q.add(i+k-1);
                    ans++;
                }
            }
            else{
                if(q.size()%2!=0){
                    if(i+k-1>=n) return -1;
                    q.add(i+k-1);
                    ans++;
                }
            }

            if((!q.isEmpty())&&q.peek()==i) q.poll();
        }

        return ans;
        
    }
}