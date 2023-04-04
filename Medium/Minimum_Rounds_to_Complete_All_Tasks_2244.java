package Medium;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Rounds_to_Complete_All_Tasks_2244 {
    public static void main(String[] args) {
        int[] tasks = { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };

        int answer = minRounds(tasks);

        System.out.println(answer);
        System.out.println(answer);
    }

    private static int minRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        int rounds = 0;
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count == 1) {
                return -1;
            }
            if (count % 3 == 0) {
                rounds += count / 3;
            } else {
                rounds += count / 3 + 1;
            }
        }

        return rounds;
    }
}
