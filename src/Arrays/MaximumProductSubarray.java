package Arrays;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int current_min = nums[0];
        int current_max = nums[0];
        int result = current_max;

        for (int i = 1; i < nums.length; i++) {
            // variable for current number
            int current = nums[i];
            // temp max is greater between current number, and max between current max times current or current
            // min times current
            int temp_max = Math.max(current, Math.max(current_max * current, current_min * current));
            // current min is reassigned to min between current and min between current max times min or current
            // min times current
            current_min = Math.min(current, Math.min(current_max * current, current_min * current));
            // current max is assigned to temp max
            current_max = temp_max;
            // result is max betweeen current max and current result
            result = Math.max(current_max, result);

        }

        return result;
    }
}


// [2, -2, 4, 5, -10. -2]

// current min = 2, current max = 2, result = 2
// temp max = 2
// temp min = -2
// current max = 2
// current min = -2
// result = 2
// temp max = 8
