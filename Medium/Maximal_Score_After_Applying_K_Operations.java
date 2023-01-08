package Medium;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Maximal_Score_After_Applying_K_Operations
 */
public class Maximal_Score_After_Applying_K_Operations {

    public static void main(String[] args) {
        int[] nums = { 1, 10, 3, 3, 3 };

        int k = 3;
        long ans = maximalScore(nums, k);
        System.out.println(ans);
    }

    private static long maximalScore(int[] nums, int k) {
        // int score = 0;
        // // Iteratively apply the operations
        // for (int i = 0; i < k; i++) {
        // // Find the index of the largest element
        // int index = 0;
        // int max = Integer.MIN_VALUE;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[j] > max) {
        // max = nums[j];
        // index = j;
        // }
        // }
        // // Update the score and replace the element
        // score += nums[index];
        // nums[index] = (int) Math.ceil(nums[index] / 3.0);
        // }
        // return score;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            queue.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            int temp = queue.poll();
            answer += temp;
            double s = (double) temp / 3;
            queue.add((int) Math.ceil(s));
        }
        return answer;
    }
}