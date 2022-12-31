import java.util.Arrays;

/**
 * PlusOne
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] ans = CreatePlusOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] CreatePlusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;
    }
}