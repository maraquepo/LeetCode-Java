package Arrays;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int midpoint = ~~(left + right)/2;
            if (nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        if (target <= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while (left <= right) {
            int midpoint = ~~(left + right)/2;
            if (nums[midpoint] == target) {
                return midpoint;
            } else if (nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }

        return -1;
    }
}
/*

[4,6,7,0,1,2]

target = 6

mid = 3 => 0
right = 3

start = 3 => 0
left = 0 => 4
right = 5 => 2
target 6

right = start
left = 0 => 4
right = 3 => 0

[4, 6 , 7, 0]

mid = 1 => 6
target = 4
target is less than mid

target is greater than mid
left = mid + 1


 */