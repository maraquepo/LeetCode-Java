package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // iterate through array
        for (int i=0; i < nums.length; i++) {
            // iterate through array one pointer ahead
            for (int j=i+1; j < nums.length; j++) {
                // complement is target minus the current number
                int complement = target - nums[i];

                // if pointer 2 is the complement
                if (nums[j] == complement) {
                    // return pointer 1 and 2
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }

    public int[] twoSumOptimized(int [] nums, int target) {
        // create a hash map
        Map<Integer, Integer> nums_map = new HashMap<>();

        // iterate through nums array
        for (int i = 0; i < nums.length; i++) {
            // complmenent is target value - current number
            int complement = target - nums[i];

            // if complement exists in the map
            if (nums_map.containsKey(complement))
                // return key of complement and current number
                return new int[] {nums_map.get(complement), i};

            // add current number into map with key and value as that current number
            nums_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }
}

/*





 */