public class KItemsWiththeMaximumSum2600 {
    public static void main(String[] args) {
        int numOnes = 3, numZeros = 2, numNegOnes = 0, k = 2;
        int ans = kItemsWithMaximumSum(numOnes, numZeros, numNegOnes,k);
        System.out.println(ans);
    }

    private static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
    }
}
