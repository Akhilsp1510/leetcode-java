class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // Step 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot, reverse whole array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find next greater element from right
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: reverse right half
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}