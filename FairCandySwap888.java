import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class FairCandySwap888 {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 1 };
        int[] bobSizes = { 2, 2 };
        int[] ans = FairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans));
    }

    private static int[] FairCandySwap(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A)
            S.add(a);
        for (int b : B)
            if (S.contains(b + dif))
                return new int[] { b + dif, b };
        return new int[0];
    }
}
