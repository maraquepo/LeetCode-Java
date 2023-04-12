package Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int [] nums) {
        int N = nums.length;

        int[] left_products = new int[N];
        int[] right_products = new int[N];

        int[] output_arr = new int[N];

        left_products[0] = 1;
        right_products[N-1] = 1;

        for (int i = 1; i < N; i++) {
            left_products[i] = nums[i-1] * left_products[i-1];
        }

        for (int i = N-2; i >= 0; i--) {
            right_products[i] = nums[i+1] * right_products[i+1];
        }

        for (int i = 0; i < N; i++) {
            output_arr[i] = left_products[i] * right_products[i];
        }

        return output_arr;
    }

    public int[] productExceptSelfOpt(int [] nums) {
        int N = nums.length;
        int[] output_arr = new int[N];

        int rightMult = 1;
        int leftMult = 1;

        for (int i = N-1; i >= 0; i--) {
            output_arr[i] = rightMult;
            rightMult *= nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            output_arr[j] *= leftMult;
            leftMult *= nums[j];
        }

        return output_arr;
    }
}
