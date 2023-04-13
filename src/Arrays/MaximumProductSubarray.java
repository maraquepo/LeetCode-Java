package Arrays;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int current_min = nums[0];
        int current_max = nums[0];
        int result = current_max;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp_max = Math.max(current, Math.max(current_max * current, current_min * current));
            current_min = Math.min(current, Math.min(current_max * current, current_min * current));

            current_max = temp_max;

            result = Math.max(current_max, result);

        }

        return result;
    }
}
