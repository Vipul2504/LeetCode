package Medium;

/**
 * HouseRobber198
 */
public class HouseRobber198 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        int ans = houseRob(nums);
        System.out.println(ans);

    }

    private static int houseRob(int[] nums) {
        int last = 0;
        int now = 0;
        int tmp;
        for (int n : nums) {
            tmp = now;
            now = Math.max(last + n, now);
            last = tmp;
        }
        return now;
    }
}