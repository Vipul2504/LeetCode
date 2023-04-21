package Medium;

public class Find_Xor_Beauty_of_Array_2527 {
    public static void main(String[] args) {
        int[] nums = { 1, 4 };
        int ans = xorBeauty(nums);
        System.out.println(ans);
    }

    private static int xorBeauty(int[] nums) {
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

}
