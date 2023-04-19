public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        Boolean GFGans = arraySortedOrNot(nums); // for gfg
        Boolean LEETans = checkSortandRotate(nums); // for LeetCode
        System.out.println(GFGans);

    }

    private static Boolean checkSortandRotate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }

        }
        return (count <= 1);
    }

    private static Boolean arraySortedOrNot(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
