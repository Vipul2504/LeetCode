import java.util.Arrays;

public class MaximumProductofThreeNumbers628 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        int ans = MaximumProductofThreeNumbers(nums);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static int MaximumProductofThreeNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
       return Math.max(nums[n-1]*nums[n-2]*nums[n-3] , nums[0]*nums[1]*nums[n-1]);
    }
}
