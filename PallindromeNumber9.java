public class PallindromeNumber9 {
    public static void main(String[] args) {
        int X = 121;
        int Y = -1221;
        Boolean ans = IsPallindrome(X);
        Boolean ans1 = IsPallindromeNum(Y);
        System.out.println(ans);
        System.out.println(ans1);
    }

    private static Boolean IsPallindromeNum(int x) {
        int sum = 0, target = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
    }

    private static Boolean IsPallindrome(int x) {
        String inputString = String.valueOf(x);
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString().equals(inputString);

    }
}
