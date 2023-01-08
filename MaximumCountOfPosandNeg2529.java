public class MaximumCountOfPosandNeg2529 {
    public static void main(String[] args) {
        int[] nums = { -2, -1, -1, 1, 2, 3 };
        int ans = MaximumCount(nums);
        System.out.println(ans);
    }

    private static int MaximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            }
            if (nums[i] < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
