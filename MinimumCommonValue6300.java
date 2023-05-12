import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue6300 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 2, 3, 4, 6 };
        int result = GetCommon(nums1, nums2);
        System.out.println(result);
    }

    private static int GetCommon(int[] nums1, int[] nums2) {
        int ans = -1;
        boolean flag = false;
        Set<Integer> set = new HashSet<Integer>();

        for (Integer i : nums1) {
            set.add(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans = nums2[i];
                flag = true;
                break;
            }
        }
        if (flag == true) {
            return ans;
        }
        return -1;
    }
}
