public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = { 11, 223, 24323, 2332, 45, 323, 42, 434, 545, 6243, 2234, 2342, 342445, 6756867, 967895687, 59 };
        int ans = FindNumber(nums);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static int FindNumber(int[] nums) {
        // int numEvn = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if ((countDigit(nums[i]) % 2) == 0) {
        // numEvn++;
        // }
        // }
        // return numEvn;
        int count = 0;

        for (int num : nums)
            count += String.valueOf(num).length() % 2 == 0 ? 1 : 0;

        return count;
    }

    // private static int countDigit(int number) {

    // return (int) Math.floor(Math.log10(number) + 1);

    // }
}
