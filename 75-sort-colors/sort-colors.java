class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
           if(nums[mid]==0){
               swap(nums,start,mid);
                mid++;
                start++;
           } else if(nums[mid]==1){
            mid++;
           } else{
            swap(nums,mid,end);
            end--;
           }            
        }
    }
    private void swap(int[]arr,int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
}