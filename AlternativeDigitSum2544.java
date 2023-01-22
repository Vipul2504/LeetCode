public class AlternativeDigitSum2544 {
    public static void main(String[] args) {
        int n = 72347352;
        int ans = AlternativeDigitSum(n);
        System.out.println(ans);
    }

    private static int AlternativeDigitSum(int n) {
        String s = n + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += i % 2 == 0 ? s.charAt(i) - '0' : -1 * (s.charAt(i) - '0');
        return sum;
    }
}
