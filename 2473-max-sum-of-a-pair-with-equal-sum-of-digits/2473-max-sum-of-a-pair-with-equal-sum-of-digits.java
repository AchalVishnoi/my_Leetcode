class Solution {
    public int maximumSum(int[] nums) {


 /*    using hashmap and priority queue

        HashMap<Integer,PriorityQueue<Integer>> sum=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        
        PriorityQueue<Integer> m=sum.getOrDefault(findSum(nums[i]),new PriorityQueue<>());
        m.add(nums[i]);
        if(m.size()>2){
            m.poll();
        }

        sum.put(findSum(nums[i]),m);
      }

        int max = -1; 
        for (PriorityQueue<Integer> pq : sum.values()) {
            if (pq.size() >= 2) {
                int a = pq.poll();
                int b= pq.poll();
                max = Math.max(max, a + b);
            }
        }
*/


int max[]=new int[82];

int ans=-1;
for(int x:nums){

int sum=findSum(x);
if(max[sum]!=0){
 ans=Math.max(ans,x+max[sum]);
}
max[sum]=Math.max(x,max[sum]);



}







       return ans;


}

    public int findSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}