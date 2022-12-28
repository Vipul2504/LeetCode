import java.util.Arrays;

public class FlippingAnImage832 {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] ans = FlipImage(image);
        System.out.println(Arrays.toString(ans));
    }

    private static int[][] FlipImage(int[][] image) {
        int n = image.length, m = image[0].length;

        // reversing rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][m - 1 - j];
                image[i][m - 1 - j] = temp;
            }
        }

        // inverting rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // image[i][j] = (image[i][j] == 0) ? 1:0;
                image[i][j] ^= 1;
            }
        }
        return image;

    }
}
