package Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
