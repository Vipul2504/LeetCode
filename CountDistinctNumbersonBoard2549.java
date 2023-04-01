
public class CountDistinctNumbersonBoard2549 {
    public static void main(String[] args) {
        int n = 5;
        int ans = distinctIntegers(n);
        System.out.println(ans);
        System.out.println(ans);

    }

    private static int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }
}
