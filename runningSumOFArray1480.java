import java.util.Arrays;

public class runningSumOFArray1480 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int[] ans = runningSumOFArray1480Son(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runningSumOFArray1480Son(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

}