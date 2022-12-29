public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int ans = DiagonalSum(mat);
        System.out.println(ans);
    }

    private static int DiagonalSum(int[][] mat) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int sum = 0;
        int n = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][n--];
        }
        if (mat.length % 2 == 0) {
            // No overlap of elements in even length matrix
            sum = primaryDiagonalSum + secondaryDiagonalSum;
        } else {
            // There will be overlap of elements in the primary and secondary diagonals if
            // and only if the length of the matrix is odd, which is at the center.
            secondaryDiagonalSum -= mat[mat.length / 2][mat.length / 2];
            sum = primaryDiagonalSum + secondaryDiagonalSum;
        }
        return sum;
    }
}
