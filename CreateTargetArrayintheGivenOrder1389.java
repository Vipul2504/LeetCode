import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayintheGivenOrder1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = CreateTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    private static int[] CreateTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            index[i] = list.get(i);
        }
        return index;
    }
}
