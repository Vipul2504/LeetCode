public class DifferenceBetweenElementSumandDigitSum2535 {
    public static void main(String[] args) {
        int[] nums = { 4, 23, 21, 5, 4, 23, 5, 6, 32 };
        int ans = DifferenceBetElemAndDigit(nums);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static int DifferenceBetElemAndDigit(int[] nums) {
        int esum = 0, dsum = 0;
        for (int i = 0; i < nums.length; i++) {
            esum += nums[i];
            while (nums[i] != 0) {
                dsum += nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return Math.abs(dsum - esum);
    }

}