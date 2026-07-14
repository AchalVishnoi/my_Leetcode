class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) return i;
        }  
        return nums.length;
    }
    public static void sort(int arr[]){
        int n=arr.length;
        int i=0;
        while (i<n){
            int idx=arr[i];
            
            if(idx<n&&arr[idx]!=arr[i]){
                swap(arr,i,idx);
            }
            else i++;
        }
    }
    public static void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}