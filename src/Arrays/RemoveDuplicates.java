package Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // index counter, set at 1 bc first one is always unique
        int index = 1;
        // iterate through numbers
        for(int i = 0; i < nums.length - 1; i++) {
            // if two consecutive numbers are different
            if(nums[i] != nums[i + 1]) {
                // replace nums[index] with current number
                // increment index
                nums[index++] = nums[i];
            }
        }
        // this will return the size of unique numbers
        return index;
    }
}
