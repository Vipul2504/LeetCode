import java.util.HashSet;

public class RemoveDuplicateFromArray26 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int ans = RemoveDuplicate(nums);
        int ans1 = RemoveDuplicateHashSet(nums);
        System.out.println(ans1);
        System.out.println(ans);
    }

    private static int RemoveDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            nums[j++] = x;
        }
        return k;
    }

    private static int RemoveDuplicate(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

}
