public class KthMissingPositiveNumber1539 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        int ans = KthMissingNumber(arr, k);
        System.out.println(ans);
    }

    private static int KthMissingNumber(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] - 1 - mid < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + k;
    }
}
