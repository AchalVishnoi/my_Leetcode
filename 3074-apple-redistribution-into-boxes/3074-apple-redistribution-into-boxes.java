class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {

        int n=cap.length;
        int sum=0;
        for(int x:apple) sum+=x;
        Arrays.sort(cap);
        int i=n-1;
        while(i>=0&&sum>0){
           sum-=cap[i--];
        }

        return n-i-1;
    }
}