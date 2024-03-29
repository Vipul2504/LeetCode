package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral_Matrix_59 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number :- ");
            int num = sc.nextInt();
            int[][] ans = SpiralMatrixII(num);
            System.out.println(Arrays.deepToString(ans));
            System.out.println(Arrays.deepToString(ans));
        }

    }

    private static int[][] SpiralMatrixII(int n) {
        int[][] res = new int[n][n];

        int cur = 1;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (cur <= n * n) {
            int i = rowBegin;
            int j = colBegin;
            // left to right
            for (j = colBegin; j <= colEnd; j++) {
                res[rowBegin][j] = cur++;
            }
            rowBegin++;
            // top to bot
            for (i = rowBegin; i <= rowEnd; i++) {
                res[i][colEnd] = cur++;
            }
            colEnd--;
            // right to left
            for (j = colEnd; j >= colBegin; j--) {
                res[rowEnd][j] = cur++;
            }
            rowEnd--;
            // bot to top
            for (i = rowEnd; i >= rowBegin; i--) {
                res[i][colBegin] = cur++;
            }
            colBegin++;
        }
        return res;
    }
}
