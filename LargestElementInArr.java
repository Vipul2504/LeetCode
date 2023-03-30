public class LargestElementInArr {
    public static void main(String[] args) {
        int[] nums = { 2, 25, 44, 27, 65, 93, 87, 59, 34, 15 };
        int ans = LargestElement(nums);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static int LargestElement(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
