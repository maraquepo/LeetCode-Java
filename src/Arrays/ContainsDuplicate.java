package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // create a map with key and value that are integers
        Map<Integer, Integer> nums_map = new HashMap<>();

        // iterate through numbers
        for (int i = 0; i < nums.length; i++) {
            // if the map has a key that contains the current number, return true
            if (nums_map.containsKey(nums[i]))
                return true;
            else
                // else add that number to the map, with its value as that number as well
                nums_map.put(nums[i], nums[i]);
        }
        return false;
    }
}
