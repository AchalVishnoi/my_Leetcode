class Solution {
    public int findDuplicate(int[] nums) {

        sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=nums[i]-1) return nums[i];
        }

        return -1;
        
    }
    public static void sort(int arr[]){
        int n=arr.length;
        int i=0;
        while (i<n){
            int idx=arr[i]-1;

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