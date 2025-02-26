package Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;
            while (left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[left_pointer], nums[right_pointer]));
                    left_pointer++;
                    right_pointer--;
                } else if (sum < target) {
                    left_pointer++;
                } else {
                    right_pointer--;
                }
            }
        }
        output.addAll(s);
        return output;
    }
}
