package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> nums_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums_map.containsKey(nums[i]))
                return true;
            else
                nums_map.put(nums[i], nums[i]);
        }
        return false;
    }
}
