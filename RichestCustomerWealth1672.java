public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 4, 6 } };
        int ans = RichestCustomerWealth(accounts);
        System.out.println(ans);
    }

    private static int RichestCustomerWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
