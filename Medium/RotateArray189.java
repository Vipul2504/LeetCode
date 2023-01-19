package Medium;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    private static long[] rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return null;
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
