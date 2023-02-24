import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntersectionofTwoArraysII350 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] ans = IntersectionofTwoArrays(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] IntersectionofTwoArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
	Arrays.sort(nums2);
	int top = 0;
	int bottom = 0;
	List<Integer> h = new ArrayList<>();

	while (true){
		if (top >= nums1.length || bottom >= nums2.length){
			break;
		}
		if (nums1[top] == nums2[bottom]){
			h.add(nums1[top]);
			top ++;
			bottom ++;
		}
		else if (nums1[top] < nums2[bottom]){
			top ++;
		}
		else if (nums1[top] > nums2[bottom]){
			bottom ++;
		}
	}

	int[] g = new int[h.size()];
	for (int i = 0; i < h.size(); i++) {
		g[i] = h.get(i);
	}
	return g;
    }
}
