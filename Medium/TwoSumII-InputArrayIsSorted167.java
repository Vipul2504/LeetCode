package Medium;

/**
 * TwoSumII-InputArrayIsSorted167
 */
public class TwoSumII-InputArrayIsSorted167
{

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int ans[] = TwoSumII(nums, target);
        int ans[] = TwoSumII(nums, target);
    }

    private static int[] TwoSumII(int[] nums, int target) {
        int lo = 0;
    int hi = nums.length - 1;
        while(nums[lo] + nums[hi] != target){
            if(nums[lo] + nums[hi] < target){
                lo++;
            }
            else{
                hi--;
            }
        }
        return new int[] {lo + 1, hi + 1};
    }

}