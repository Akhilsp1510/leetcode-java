class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long curr=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            n++;
            }
            else{
                curr+=(n*(n+1)/2);
                n=0;
            }
        }
        if(n>0){
            curr+=(n*(n+1)/2);
        }
        return curr;
    }
}