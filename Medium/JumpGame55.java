package Medium;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        Boolean ans = JumpGame(nums);
        System.out.println(ans);
    }

    private static Boolean JumpGame(int[] nums) {
        int bound = 0;
        for (int i = 0; i <= bound; i++) {
            bound = Math.max(bound, i + nums[i]);
            if (bound >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
