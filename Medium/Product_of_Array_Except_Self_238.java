package Medium;

import java.util.Arrays;

/**
 * Product_of_Array_Except_Self_238
 */
public class Product_of_Array_Except_Self_238 {

    public static void main(String[] args) {
        int[] nums = { 4, 5, 1, 8, 2 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    private static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0, left = 1; i < nums.length; i++) {
            ans[i] = left;
            left *= nums[i];
        }
        for (int j = nums.length - 1, right = 1; j >= 0; j--) {
            ans[j] *= right;
            right *= nums[j];
        }
        return ans;
    }

}