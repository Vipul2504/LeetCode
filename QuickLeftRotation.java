import java.util.Arrays;

public class QuickLeftRotation {
    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int N = 6, K = 2;
        long[] ans = LeftRotate(arr, N, K);
        System.out.println(Arrays.toString(ans));
    }

    private static long[] LeftRotate(long[] arr, int n, int k) {
        long[] temp = new long[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[(i + k) % n];
        }
        return arr;
    }
}
