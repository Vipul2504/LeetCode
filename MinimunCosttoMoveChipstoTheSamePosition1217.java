public class MinimunCosttoMoveChipstoTheSamePosition1217 {
    public static void main(String[] args) {
        int[] position = { 2, 2, 2, 3, 3 };
        int ans = minCostToMoveChips(position);
        System.out.println(ans);
    }

    private static int minCostToMoveChips(int[] position) {
        int EvenCount = 0;
        int OddCount = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
        }
        return Math.min(EvenCount, OddCount);
    }
}
