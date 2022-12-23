import java.util.Arrays;

public class SuffleTheArray1470 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] res = SuffleTheArray(nums, n);
        System.out.println(Arrays.toString(res));
    }

    private static int[] SuffleTheArray(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;
        for (int i = 0; i < nums.length;) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            i += 2;
            j++;
        }
        return ans;
    }
}
