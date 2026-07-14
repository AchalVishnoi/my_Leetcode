class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        sort(nums);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int idx=nums[i]-1;
            if(idx!=i){
                l.add(i+1);
            }
        }

        return l;
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