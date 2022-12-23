public class NumberOfGoodPair1512 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3, 2, 1, 3 };
        int ans = Goodpairs(nums);
        System.out.println(ans);
    }

    private static int Goodpairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
