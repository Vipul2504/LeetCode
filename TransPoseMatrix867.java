import java.util.Arrays;

public class TransPoseMatrix867 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] ans = TransposeMatrix(matrix);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] TransposeMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] reversematrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reversematrix[j][i] = matrix[i][j];
            }
        }
        return reversematrix;
    }
}
