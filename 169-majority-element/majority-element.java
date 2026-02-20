class Solution {
    public int majorityElement(int[] nums) {
        int cad=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cad=nums[i];
            }
            if(cad==nums[i]){
                count++;
            }
            else{
                count --;
            }
        }
        return cad;
    }
}