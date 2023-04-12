package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                int complement = target - nums[i];

                if (nums[j] == complement) {
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }

    public int[] twoSumOptimized(int [] nums, int target) {
        Map<Integer, Integer> nums_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (nums_map.containsKey(complement))
                return new int[] {nums_map.get(complement), i};

            nums_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }
}

/*





 */