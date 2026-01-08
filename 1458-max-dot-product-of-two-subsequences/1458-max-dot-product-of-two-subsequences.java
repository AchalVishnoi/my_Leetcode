class Solution {
    Integer dp[][];
    int NEG=-10000000;
    public int maxDotProduct(int[] nums1, int[] nums2) {

        dp=new Integer[nums1.length][nums2.length];

        return find(nums1,nums2,0,0);
        
    }
    public int find(int nums1[],int nums2[],int i,int j){

        int n1=nums1.length;
        int n2=nums2.length;
        if(i>=n1||j>=n2) return NEG;
        if(dp[i][j]!=null) return dp[i][j];


        int a=nums1[i]*nums2[j]+Math.max(0,find(nums1,nums2,i+1,j+1));
        a=Math.max(a,find(nums1,nums2,i+1,j));
        a=Math.max(a,find(nums1,nums2,i,j+1));

        return dp[i][j]=a;


    }
}