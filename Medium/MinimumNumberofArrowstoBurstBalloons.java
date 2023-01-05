package Medium;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args) {
        int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        int ans = FindMinArrow(points);
        System.out.println(ans);
    }

    private static int FindMinArrow(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ArrowCount = 1;
        int previous = 0;
        for (int current = 0; current < points.length; current++) {
            // If the start position of current balloon is after the end
            // position of previous balloon then increment arrow counter.
            if (points[current][0] > points[previous][1]) {
                ArrowCount++;
                // Update the index of the previously burst balloon
                previous = current;
            }

        }

        return ArrowCount;

    }
}
