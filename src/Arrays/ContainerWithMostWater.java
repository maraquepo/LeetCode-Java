package Arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // set left pointer
        int left = 0;
        // set right pointer
        int right = height.length - 1;
        int max = 0;
        // while pointers don't cross eah other
        while (left < right) {
            // width is right minus left pointer
            int w = right - left;
            // height is the smallest between left and right pointer
            int h = Math.min(height[left], height[right]);
            // area is width times height
            int area = w * h;
            // max is either new area or old area
            max = Math.max(max, area);
            // if right pointer is taller, shift left pointer up
            if (height[left] < height[right]) {
                left++;
                // if left pointer is taller, shift right pointer down
            } else if (height[left] > height[right]) {
                right--;
                // if both are equal, shift both
            } else {
                left++;
                right--;
            }
        }
        return max; 
    }
}
